package resultadoFinal;

import java.util.Scanner;

public class boletim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua nota por favor ");
		int nota = sc.nextInt();

		if (nota < 5) {
			System.out.println("Recuperação" + " " + nota);
		} else {
			System.out.println("Aprovado" + " " + nota);
			sc.close();
		}
	}
}
