package controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import dao.ProdutoDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Produto;


@WebServlet(
		name = "salvarProduto",
		urlPatterns = "/salvarProduto"
	)

public class SalvarProdutoServlet extends HttpServlet {
	
		
			private static final long serialVersionUID = 1L;
			
			
			public void doPost(
					HttpServletRequest httpServletRequest, 
					HttpServletResponse httpServletResponse
			) throws IOException {
				
				Produto produto = new Produto();
				ProdutoDAO produtoDAO = new ProdutoDAO();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
				
				motoristaDAO.criarTabelaMotorista();	
				
				motorista.setNome(httpServletRequest.getParameter("nome"));
				motorista.setDataNascimento(httpServletRequest.getParameter("dataNascimento"));
				motorista.setCpf(httpServletRequest.getParameter("cpf"));
				motorista.setTelefone(httpServletRequest.getParameter("telefone"));
				motorista.setEmail(httpServletRequest.getParameter("email"));
				motorista.setEndereco(httpServletRequest.getParameter("endereco"));
				motorista.setNacionalidade(httpServletRequest.getParameter("nacionalidade"));
				motorista.setCategoriaCnh(httpServletRequest.getParameter("categoriaCnh"));
				motorista.setVencimentoCnh(httpServletRequest.getParameter("vencimentoCnh"));
				motorista.setPorcentagem(httpServletRequest.getParameter("porcentagem"));
				motorista.setDataContratacao(httpServletRequest.getParameter("dataContratacao"));
				motorista.setObs(httpServletRequest.getParameter("obs"));
				motorista.setLogin(httpServletRequest.getParameter("login"));
				motorista.setSenha(httpServletRequest.getParameter("senha"));
				
					motoristaDAO.cadastrar(motorista);
				
					System.out.println("Motorista cadastrado: " + motorista.getNome() + " " + 
							" | Horário: " + dtf.format(LocalDateTime.now()));           
				
				httpServletResponse.sendRedirect("menuMotoristas.jsp");
				
			}
		}	
	

