package br.com.bancobrazil.banco.menus;

import java.util.Scanner;

public class MenuCliente {

	private static int opcao = 1;
	private static boolean erro = true;
	public static Scanner entrada = new Scanner(System.in);

	public static void exibeMenu() {
	
		opcao = 1;
		while (opcao != 0) {
		
			System.out.println();
			System.out.println("*************************************************************");
			System.out.println();
			System.out.println(" *** ESCOLHA UMA OPERACAO ***");
			System.out.println(" 1 -> Deposito");
			System.out.println(" 2 -> Saque");
			System.out.println(" 3 -> Transferencia");
			System.out.println(" 4 -> Extrato");
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
				escolheOperacao(opcao);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		
		entrada.nextLine();
		
	}
	
	
	/** CHAMA A OPERACAO QUE O CLIENTE ESCOLHEU **/
	public static void escolheOperacao(int opcao) {
		
		switch (opcao) {
		case 1:
			erro = false;
			System.out.println("**OPCAO ESCOLHIDA: 1!");
			break;
		case 2:
			erro = false;
			System.out.println("**OPCAO ESCOLHIDA: 2!");
			break;
		case 3:
			erro = false;
			System.out.println("**OPCAO ESCOLHIDA: 3!");
			break;
		case 0:
			System.out.println("**OPCAO ESCOLHIDA: 3 - VOLTAR!");
			erro = false;
			break;
		default:
			System.out.println(" ! OPCAO INVALIDA !");
			System.out.println();
		}
	}

	
}