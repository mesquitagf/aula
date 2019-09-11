package aep_2;

import java.util.Date;

public class Avaliação {
	private String disciplina;
	private String dia;
	
	public Avaliação(String disciplina, String dia) {
		this.disciplina = disciplina;
		this.dia = dia;
	}
	
	public String getDisciplinaAvaliação() {
		return disciplina;
	}

	public String getDiaAvaliação() {
		return dia;
	}
}
