package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import factory.ConnectionFactory;
import model.Produto;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void criarTabelaProdutos() {
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "idProduto BIGSERIAL PRIMARY KEY," +
                "nomeProduto VARCHAR(50)," +
                "valorCusto DECIMAL(10, 2)," +
                "valorVenda DECIMAL(10, 2)," +
                "codigoDeBarras INT," +
                "disponivel BOOLEAN" +
                ");";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("\nVoce ja cadastrou uma Categoria ou um Fornecedor? Se não, crie-os e depois cadastre um produtos\n");
            throw new RuntimeException(e);
        }
    }

    public void cadastrarProduto(Produto produto) {
        String sql = "INSERT INTO produtos(nomeProduto, valorCusto, valorVenda, codigoDeBarras, disponivel) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, produto.getNomeProduto());
            preparedStatement.setDouble(2, produto.getValorCusto());
            preparedStatement.setDouble(3, produto.getValorVenda());
            preparedStatement.setLong(4, produto.getCodigoDeBarras());
            preparedStatement.setBoolean(5, produto.getDisponivel());
           

            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()) {
                produto.setIdProduto(resultSet.getInt(1));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}