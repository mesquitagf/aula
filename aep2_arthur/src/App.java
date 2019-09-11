package aep_2;

public class App {
	public static void main(String[] args) {
		
		Avalia��o avalia��oPoo = new Avalia��o("Programa��o Orientada a Objetos", "2019-10-19");
		Aluno aluno = new Aluno(18306112, "Gabriel Fungache Mesquita");
		//Aluno aluno = new Aluno(183061124, "Gabriel Fungache Mesquita"); -> testar valida��o exception do RA
		
		Conceito conceitoPoo = new Conceito("POO");
		
		conceitoPoo.adicionarAvalia��o(avalia��oPoo);
		conceitoPoo.adicionarAluno(aluno);
		conceitoPoo.adicionarNota(9);
		//conceitoPoo.adicionarNota(4); -> testar situ��o final do aluno
		//conceitoPoo.adicionarNota(-5); -> testar valida��o exception da nota
		
		System.out.println("############ Conceito - " + conceitoPoo.getIdConceito() + " ############ ");
		System.out.println("Avalia��o de " + conceitoPoo.getAvalia��o().getDisciplinaAvalia��o());
		System.out.println("Aluno: " + conceitoPoo.getAluno().getNomeAluno() + " - " + conceitoPoo.getAluno().getRa());
		System.out.println("Nota: " + conceitoPoo.getNota().getValorNota());
		validaSituacaoAluno(conceitoPoo.getNota().getAprova��o());
	}
	
	public static void validaSituacaoAluno(boolean situa��o) {	
		if(situa��o) {
			System.out.println("Situa��o: APROVADO");
		}else {
			System.out.println("Situa��o: RETIDO PARA EXAME");
		}		
	}
}
