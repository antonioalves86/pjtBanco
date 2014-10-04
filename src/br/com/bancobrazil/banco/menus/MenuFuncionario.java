package br.com.bancobrazil.banco.menus;

import java.util.Scanner;
import br.com.bancobrazil.banco.conta.Conta;
import br.com.bancobrazil.banco.usuarios.Funcionario;
import br.com.bancobrazil.banco.usuarios.Cliente;

public class MenuFuncionario {

	private static int opcao = 1;
	private static boolean erro = true;
	public static Scanner entrada = new Scanner(System.in);

	public static void exibeMenu() {
		
		opcao = 1;
		while (opcao != 0) {

			System.out.println();
			System.out.println("*************************************************************");
			System.out.println();
			System.out.println(" <<< ESCOLHA UMA opcao >>>");
			System.out.println(" 1 -> Cadastrar Funcionario");
			System.out.println(" 2 -> Cadastrar Cliente");
			System.out.println(" 3 -> Criar Conta");
			System.out.println(" 4 -> Excluir Funcionario");
			System.out.println(" 5 -> Excluir Cliente");
			System.out.println(" 6 -> Encerrar Conta");
			System.out.println(" 7 -> Exibe Conta");
			System.out.println(" 0 -> VOLTAR");
			lerOpcao();
		}

	}
	
	
	public static void lerOpcao() {
		
		erro = true;
		while (erro) {
			System.out.print(" OPCAO: ");
			try {
				opcao = entrada.nextInt();
				escolheOpcao(opcao);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		
		entrada.nextLine();
		
	}
	
	
	/** CHAMA A ROTINA QUE O FUNCIONARIO ESCOLHEU **/
	public static void escolheOpcao(int opcao) {
	
		switch (opcao) {
		case 1:
			erro = false;
			criaFuncionario();
			break;
		case 2:
			erro = false;
			criaCliente();
			break;
		case 3:
			erro = false;
			criaConta();
			break;
		case 0:
			erro = false;
			break;
		default:
			System.out.println(" ! OPCAO INVALIDA !");
			System.out.println();
		}
	}

	
	/** CRIA UM FUNCIONARIO **/
	public static void criaFuncionario() {

		String nome;
		String endereco;
		String cpf;
		int idade;

		System.out
				.println("-------------------------------------------------------------");
		System.out.println(" ### CADASTRO DE FUNCIONARIO ###");

		Scanner entrada = new Scanner(System.in);

		System.out.print(" Nome:............... ");
		nome = entrada.nextLine();

		System.out.print(" CPF:................ ");
		cpf = entrada.nextLine();

		System.out.print(" Idade:.............. ");
		idade = entrada.nextInt();

		System.out.print(" Endereco:........... ");
		endereco = entrada.nextLine();

		Funcionario funcionario = new Funcionario(nome, endereco, cpf, idade);
		System.out.println(" Funcionario Cadastrado com Sucesso!");
		entrada.close();

	}
	
	
	/** CRIA UM CLIENTE **/
	public static void criaCliente() {

		String nome;
		String endereco;
		String cpf;
		int idade;

		System.out
				.println("-------------------------------------------------------------");
		System.out.println(" ### CADASTRO DE CLIENTE ###");

		Scanner entrada = new Scanner(System.in);

		System.out.print(" Nome:............... ");
		nome = entrada.nextLine();

		System.out.print(" CPF:................ ");
		cpf = entrada.nextLine();

		System.out.print(" Idade:.............. ");
		idade = entrada.nextInt();

		System.out.print(" Endereco:........... ");
		endereco = entrada.nextLine();

		Cliente cliente = new Cliente(nome, cpf, endereco, idade);
		System.out.println(" Cliente Cadastrado com Sucesso!");
		entrada.close();
	}

	
	/** CRIA UM CONTA **/
	public static void criaConta() {

		// Cliente titular;
		int numero;
		String senha;
		double saldo;
		double limite;

		System.out
				.println("-------------------------------------------------------------");
		System.out.println(" ### CRIANDO UM CONTA ###");
		// System.out.println(" Deseja Cadastrar um Cliente antes?");

		System.out.println();

		Scanner entrada = new Scanner(System.in);

		System.out.print(" N. da Conta:........ ");
		numero = entrada.nextInt();

		System.out.print(" Senha:.............. ");
		senha = entrada.nextLine();

		System.out.print(" Deposito Inicial:... ");
		saldo = entrada.nextDouble();

		System.out.print(" Limite:............. ");
		limite = entrada.nextDouble();

		Conta conta = new Conta(numero, senha, saldo, limite);
		
		System.out.println(" Conta Criada com Sucesso!");
		// System.out.println(conta.getNomeTitular());
		entrada.close();

	}

	// Conta(int numero, String senha, double saldo, double limite)
	// Conta(Cliente titular, int numero, String senha, double saldo, double
	// limite)
	

	
	/** Exibe Detalhes da Conta **/
	public static void exibeDados(Conta conta) {
	
		System.out.println(" Numero da conta....: " + conta.getNumero());
		System.out.println(" Cliente............: " + conta.getNomeTitular());
		System.out.println(" CPF................: " + conta.getTitular().getCpf());
		System.out.println(" Saldo..............: " + conta.getSaldo());
		System.out.println(" Limite.............: " + conta.getLimite());
		System.out.println();
	
	}
	
	
}