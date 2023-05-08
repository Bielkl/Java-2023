package resultadoFinal;

import java.util.Scanner;

public class múltiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero ");
		int numero1 = sc.nextInt();

		System.out.println("São múltiplos");
		int numero2 = sc.nextInt();

		sc.close();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("São múltiplos um do outro ");
		} else {
			System.out.println("Não são múltiplos");
		}

	}

}
