package resultadoFinal;

public class tabelaJava {

	public static void main(String[] args) {

		float notaFinal = 7;
		
		boolean aluno1 = notaFinal >= 5;
		System.out.println("sua nota foi " + " " + notaFinal);

		boolean aluno2 = notaFinal < 7;
		System.out.println("sua nota foi" + " " + notaFinal);

		boolean mostrandoE = aluno1 && aluno2;
		System.out.println("as notas sao iguais? " + mostrandoE);
		boolean mostrandoOu = aluno1 || aluno2;
		System.out.println("as notas são iguais  " + mostrandoOu);
	}
}
