package conceito;

public class Nota {
	private double valor;
	private boolean aprovado;
	
	public Nota(double valor) {
		validarNota(valor);
		this.valor = valor;
	}
	
	public void validarNota(double valor) {
		if(valor < 0 || valor > 10) {
			throw new RuntimeException("Nota inserida inv�lida! Por favor, tente novamente...");
		}else if(valor >= 6){
			aprovado = true;
		}else {
			aprovado = false;
		}
	}
	
	public double getValorNota() {
		return valor;
	}
	
	public boolean getAprovação() {
		return aprovado;
	}
}
