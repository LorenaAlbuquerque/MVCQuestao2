<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="PessoaDados" method="get">
		Digite seu nome: <input type="text" name="nome" size=15> <br><br>
		Digite seu endere�o: <input type="text" name="endereco" size=15> <br><br>
		Digite seu ano de nascimento: <input type="number" name="anoNascimento" size=15> <br><br> 
		J� fez anivers�rio esse ano? <select name="opcaoJaAniversario">
			<option value=Sim>Sim</option>
			<option value=N�o>N�o</option>
		</select> <br><br> 
		<input type='submit' value="Enviar">
	</form>
</body>
</html>