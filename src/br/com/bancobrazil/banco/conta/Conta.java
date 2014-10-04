package br.com.bancobrazil.banco.conta;

import br.com.bancobrazil.banco.sistema.ValorInvalidoException;

import br.com.bancobrazil.banco.usuarios.Cliente;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Antonio S. Alves
*/
public class Conta {

	private Cliente titular; 	// ??? como referencia uma conta a um cliente (private)
	private int numero;
	private String senha;
	private double saldo;
	private double limite = 350;
	private int saquesDoDia;
	private static int totalDeContas;
	
	
	/** Construtor da Classe - sem argumentos **/
	public Conta() {}
	
	/** Construtor da Classe - sem o Titular **/
	public Conta(int numero, String senha, double saldo, double limite) {
		
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
		this.limite = limite;
		Conta.totalDeContas++;
	}
	
	/** Construtor da Classe - com o Titular **/
	public Conta(Cliente titular, int numero, String senha, double saldo, double limite) {
		
		this(numero, senha, saldo, limite);
		this.titular = titular;				//titular.setNomeCliente(titular.nome); ??????????????
	}

	
	/** Retorna o Total de contas criadas **/
	public static int getTotalDeContas() {
	
		return Conta.totalDeContas;
	}
	
	/** Retorna o numero da conta*/
	public int getNumero() {
		return this.numero;
	}
	
	/** Retorna o titular da conta */
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	/** */
	public Cliente getTitular() {
		return this.titular;
	}
	
	
	public String getNomeTitular() {
		return this.titular.getNome();
	}
	
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return this.limite;
	}
	
	/** Valida Senha **/
	public boolean valida(int numero, String senha) {
	
		if (numero == this.numero && senha == this.senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Senha Nao Confere!!");
			return false;
		}
	}
	


	/** Realiza um Saque **/
	public boolean saca(double valor) {
		
		//posso sacar até saldo+limite
		if (this.saquesDoDia > 3) { 
			System.out.println("Numero de saques ultrapassou o limite!");
			//throw new IllegalArgumentException("estourou limite!");
			return false;
		} else {
			if (valor > this.saldo + this.limite) {
				System.out.println("Saldo Insuficiente!!!");
				return false;
			} else {
				this.saldo = this.saldo - valor;
				this.saquesDoDia++;
				return true;
			}
		}
	}
	
	/*
	/** Faz um Depósito **
	public void deposita(double valor) {
		
		if (valor < 0 ) {
			throw new IllegalArgumentException("Você tentou depositar um valor inválido");
		} else {
			this.saldo += valor;
		}
	}
	*/
	
	
	/** Faz um Depósito **/
	public void deposita(double valor) {
		
		if (valor <= 0 ) {
			throw new ValorInvalidoException("Valor inválido: R$ " + valor);
		} else {
			this.saldo += valor;
		}
	}
	
	
	/** Faz uma Transferencia Entre Duas Contas **/
	boolean transferePara(Conta destino, double valor) {
		
		boolean retirou = this.saca(valor); //Realiza o Saque da conta e..		//igual a: if ( this.saca(valor) )
		if (retirou == false) {
			// não deu pra sacar!
			System.out.println("Transferencia Nao Permitida - Saldo Insuficiente!!");
			return false;
		} else {
			this.saquesDoDia--;
			destino.deposita(valor);		//..Faz o Depósito na Conta de Destino
			return true;
		}
	}	
	
}