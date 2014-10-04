package br.com.bancobrazil.banco.menus;

import br.com.bancobrazil.banco.menus.MenuCliente;
import br.com.bancobrazil.banco.menus.MenuFuncionario;
import java.util.Scanner;

public class MenuPrincipal {

	public static int opcao;
	public static boolean erro;
	public static Scanner entrada = new Scanner(System.in);
	
	public static void exibeMenu() {
		
		opcao = 1;
		while (opcao != 0) {
			
			System.out.println();
			System.out.println("***********************************************************");
			System.out.println();
			System.out.println(" #### ESCOLHA UM USUARIO ####");
			System.out.println(" 1 -> Funcionario");
			System.out.println(" 2 -> Cliente");
			System.out.println(" 0 -> Encerrar");
			lerOpcao();
		}
		
	}
	

	/** ESPERA O USUARIO DIGITAR 1 PARA ENTRAR NO SISTEMA **/
	public static void lerOpcao() {
		
		erro = true;
		while (erro) {
			System.out.print(" OPCAO: ");
			try {
				opcao = entrada.nextInt();
				escolheUsuario(opcao);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
		
		entrada.nextLine();
		
	}
	
	
	/** CHAMA O MENU ESCOLHIDO **/
	public static void escolheUsuario(int opcao) {
		
		switch (opcao) {
		case 1:
			erro = false;
			MenuFuncionario.exibeMenu();
			break;
		case 2:
			erro = false;
			MenuCliente.exibeMenu();
			break;
		case 0:
			erro = false;			
			break;
		default:
			System.out.println(" ! OPÇÃO IVALIDA !");
			//System.out.println();
		}
		
	}
	
}