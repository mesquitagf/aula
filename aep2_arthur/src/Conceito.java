package aep_2;

public class Conceito {
	private final String id;
	private Avaliação avaliação;
	private Aluno aluno;
	private Nota nota;
	
	public Conceito(String id){
		this.id = id;
	}
	
	public void adicionarAvaliação(Avaliação avaliação) {
		this.avaliação = avaliação;
	}

	public void adicionarAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void adicionarNota(double nota) {
		this.nota = new Nota(nota);
	}
	
	public String getIdConceito() {
		return id;
	}
	
	public Avaliação getAvaliação() {
		return avaliação;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Nota getNota() {
		return nota;
	}
}
