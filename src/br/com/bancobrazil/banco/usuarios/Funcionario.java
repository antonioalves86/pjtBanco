package br.com.bancobrazil.banco.usuarios;

/*** CLASSE FUNCIONARIO ****/
public class Funcionario {

	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	//private String dataDeEntrada, dataDeSaida;
	private String cargo;
	private double salario;
	//private boolean estaNaEmpresa;
	
	/** Contrutor **/
	public Funcionario() {}
	
	/** Construtor **/
	public Funcionario(String nome, String endereco, String cpf, int idade) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}
	
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
	
	public void setCPF(String cpf) {
		//	validaCPF(cpf);
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	/*
	private void adimite() {
		this.estaNaEmpresa = true;
		//this.dataDeEntrada = 
	}
	
	private void demite() {
		this.estaNaEmpresa = false;
		this.salario = 0.00;
		this.dataDeSaida = "23/07/14";
	}
	*/
	
	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}
  
	public double calculaGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}
	
	public double calculaFerias(int qtdMesTrabalhado) {
		double Ferias =  (qtdMesTrabalhado * this.salario) /  12.00;
		return Ferias;
	}
	


	/** Exibe Informacoes do Funcionario **/
	public void exibeDados() {
		System.out.println("   Funcionario.....: " + this.nome    + "\tCargo.........: " + this.cargo);
		System.out.println("   Idade...........: " + this.idade   + "\tCPF...........: " + this.cpf);
		System.out.println("   Salario.........: " + this.salario + "\tGanho anual...: " + this.calculaGanhoAnual());
		//System.out.println("   Adimitido em....: " + this.dataDeEntrada);
		/*
		if (this.estaNaEmpresa) {
			System.out.println("   < Funcionario Efetivo >");
		} else {
			System.out.println("   <** Funcionario Desligado da Empresa **>");
		}
		*/
		System.out.println();
	}

}