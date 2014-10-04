package br.com.bancobrazil.banco.sistema;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(String mensagem) {
		super(mensagem);
	}
	
	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}
}