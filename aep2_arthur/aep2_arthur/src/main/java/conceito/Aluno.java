package conceito;

public class Aluno {
	private String nome;
	private Integer ra;
	
	public Aluno(Integer ra, String nome) {
		this.nome = nome;
		validaRA(ra);
		this.ra = ra;
	}
	
	public int getRa() {
		return this.ra;
	}
	
	public String getNomeAluno() {
		return nome;
	}
	
	public void validaRA(Integer ra) {
		if(ra < 0 || ra > 99999999) {
			throw new RuntimeException("RA do aluno inv�lido! Por favor, tente novamente...");
		}
	}
}
