package br.com.bancobrazil.banco.sistema;


/** Classe(Programa) Principal respons�vel por rodar chamar a aplica��o*/
public class Banco {
	
	public static void main(String[] args) {
		
		System.out.println(" SISTEMA INICIADO...");
		try {
			TelaInicial.exibeMenu();
		} catch (Exception e) {
			System.err.println("\n\n FALHA NO SISTEMA... Tente mais tarde.");
		}
	
	}
	
}