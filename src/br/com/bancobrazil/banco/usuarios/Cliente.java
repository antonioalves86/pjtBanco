package br.com.bancobrazil.banco.usuarios;

public class Cliente {

	private String nome;
	private String endereco;
	private String cpf;
	private int idade;

	//Construtor da Classe
	public Cliente() {}
	
	//Construtor da Classe
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Construtor da Classe
	public Cliente(String nome, String cpf, String endereco, int idade) {
		this(nome, cpf);
		this.endereco = endereco;
		this.idade = idade;
	}
	
	/* ou
	
	//Construtor da Classe
	public Cliente(String nome, String cpf) {
		this(nome, cpf, null, null)

	}
	
	//Construtor da Classe
	public Cliente(String nome, String cpf, String endereco, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
	}
	
	*/
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}	
	
	public void setCpf(String cpf) {
		//	validaCPF(cpf);
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	/*
	private void validaCPF(String cpf) {
		
		// série de regras aqui, falha caso não seja válido
	}
	*/
	

	
	
	/** Exibe Infomacoes do Cliente **/
	public void exibeDados() {
		System.out.println("   Cliente.........: " + this.getNome()    + "\tCPF..............: " + this.getCpf());
		System.out.println("   Idade...........: " + this.getIdade()   + "\tEndereco.........: " + this.getEndereco());
		System.out.println();
	}
	
	

}