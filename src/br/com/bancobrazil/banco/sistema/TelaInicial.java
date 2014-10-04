package br.com.bancobrazil.banco.sistema;

import br.com.bancobrazil.banco.menus.MenuPrincipal;
import java.util.Scanner;

/** Mostrar a primeira tela do sistema bancario */
public class TelaInicial {


	public static boolean erro;
	public static int opcao;
	public static Scanner entrada = new Scanner(System.in);
	
	/** MOSTRA A TELA INICIAL **/
	public static void exibeMenu() {
	
		while (true) {
			System.out.println("\n\n\n\n");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("\n\t###########################");
			System.out.println("\t#|-----------------------|#");
			System.out.println("\t#|    MEU BANCO S&A      |#");
			System.out.println("\t#|-----------------------|#");
			System.out.println("\t###########################");
			System.out.println();
			lerOpcao();
			
		}
	}
	
	
	/** ESPERA O USUARIO DIGITAR 1 PARA ENTRAR NO MENU PRINCIPAL **/
	public static void lerOpcao() {
	
		erro = true;
		while (erro) {
			System.out.print("\t  Tecle 1 para ENTRAR --- ");
			try {
				opcao = entrada.nextInt();
				if (opcao == 1) {
					erro = false;
					MenuPrincipal.exibeMenu();
				} else {
					System.out.println("\t  OPÇÃO IVALIDA. - Tente outra vez!!!");
				}
			} catch (Exception e) {
				System.err.print(e.getMessage());
			}
		}
		
		entrada.nextLine();
	}
	
}