package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pessoa;

@WebServlet("/PessoaDados")
public class PessoaDados extends HttpServlet {
	private static final long serialVersionUID = 1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String endereco = request.getParameter("endereco");
			String anoNascimentoString = request.getParameter("anoNascimento");
			String opcaoJaAniversario = request.getParameter("opcaoJaAniversario");

			int anoNascimento = Integer.parseInt(anoNascimentoString);
			Calendar cal = Calendar.getInstance();
			int anoAtual = cal.get(Calendar.YEAR);

			PrintWriter writer = response.getWriter();
			
			Pessoa pessoa = new Pessoa();
	        pessoa.setNome(nome);
	        pessoa.setEndereco(endereco);
	        pessoa.setAnoNascimento(anoNascimento);

			writer.append(" <HTML>  <BODY> ");
	        writer.append("Nome: " + pessoa.getNome());
	        writer.append("<br>Endereço: " + pessoa.getEndereco());
	        writer.append("<br>Ano de Nascimento: " + pessoa.getAnoNascimento());
			if (opcaoJaAniversario.equals("Sim")) {
				writer.append("<br>Idade: " + (anoAtual - anoNascimento));
			} else {
				writer.append("<br>Idade: " + (anoAtual - anoNascimento - 1));
			}
			writer.append("</BODY>  </HTML>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}