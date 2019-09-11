package aep_2;

public class Conceito {
	private final String id;
	private Avalia��o avalia��o;
	private Aluno aluno;
	private Nota nota;
	
	public Conceito(String id){
		this.id = id;
	}
	
	public void adicionarAvalia��o(Avalia��o avalia��o) {
		this.avalia��o = avalia��o;
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
	
	public Avalia��o getAvalia��o() {
		return avalia��o;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Nota getNota() {
		return nota;
	}
}
