package conceito;

public class App {
	public static void main(String[] args) {
		
		Avaliação avaliaçãoPoo = new Avaliação("Programação Orientada a Objetos", "2019-10-19");
		Aluno aluno = new Aluno(18306112, "Gabriel Fungache Mesquita");
		//Aluno aluno = new Aluno(183061124, "Gabriel Fungache Mesquita"); -> testar validação exception do RA
		
		Conceito conceitoPoo = new Conceito("POO");
		
		conceitoPoo.adicionarAvaliação(avaliaçãoPoo);
		conceitoPoo.adicionarAluno(aluno);
		conceitoPoo.adicionarNota(9);
		//conceitoPoo.adicionarNota(4); -> testar situção final do aluno
		//conceitoPoo.adicionarNota(-5); -> testar validação exception da nota
		
		System.out.println("############ Conceito - " + conceitoPoo.getIdConceito() + " ############ ");
		System.out.println("Avaliação de " + conceitoPoo.getAvaliação().getDisciplinaAvaliação());
		System.out.println("Aluno: " + conceitoPoo.getAluno().getNomeAluno() + " - " + conceitoPoo.getAluno().getRa());
		System.out.println("Nota: " + conceitoPoo.getNota().getValorNota());
		validaSituacaoAluno(conceitoPoo.getNota().getAprovação());
	}
	
	public static void validaSituacaoAluno(boolean situação) {	
		if(situação) {
			System.out.println("Situação: APROVADO");
		}else {
			System.out.println("Situação: RETIDO PARA EXAME");
		}		
	}
}
