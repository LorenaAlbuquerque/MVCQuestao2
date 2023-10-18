package model;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private int anoNascimento;
	boolean opcaoJaAniversario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public boolean isOpcaoJaAniversario() {
	     return opcaoJaAniversario;
	}
	public void setOpcaoJaAniversario(boolean opcaoJaAniversario) {
	     this.opcaoJaAniversario = opcaoJaAniversario;
	}
}
