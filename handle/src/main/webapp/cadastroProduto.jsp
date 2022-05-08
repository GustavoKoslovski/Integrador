<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Cadastro de produto</title>
	</head>
	<body>
	
	<div style="height: 100%; justify-content: center; display: flex; text-align: left">
		
		<form action="salvarProduto" method="post" 
				style="width: 700px;
					border: 10px solid #154c79;
					padding: 10px;
					border-radius: 20px 20px 0px 0px;">
						   
				<div style= " display: flex; width: 900px;">
						   
					<div style= "text-align: left; width: 400px;">
					
					
						<p style ="font-size: 38px ">Cadastro de Produto</p>
		  	
							<p>Nome:
								 <input type="text" name="nome" placeholder="Nome">
							</p>		  	
								  	
							<p>Código de Barras:
								 <input type="text" name="codigoBarra" size="20" maxlength="11" placeholder="Apenas Números">
							</p>
								  	
							<p>Valor de Custo:
								 <input type="text" name="valorCusto" size="20" maxlength="15" placeholder="Apenas Números">
							</p>
								  	
							<p>Valor de Venda:
								 <input type="text" name="valorVenda" size="20" maxlength="40" placeholder="Apenas Números" ><br>
							</p>

							
					</div>

						<div style=" width: 200px; display: inline-block; height: 150px">
					
					</div>
					
							<div>	
								<a href= "menuProdutos.jsp"><input type="submit" 
	 								style= " cursor: pointer; font-size: 30px; 
	 								background-color: #63ef93; border: 4px solid #154c79;
	 								border-radius: 40px;
	 								position:relative;
	 								top: 48px;
	 								right: 200px;
	 								box-shadow: 2px 5px 5px black; "></a> 
							</div>
					
				</div>	
		  	</form>
  		</div>
	</body>
</html>