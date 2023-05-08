package resultadoFinal;

import java.util.Scanner;

public class eleicao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o ano do seu nascimento");
		int ano = sc.nextInt();
		sc.close();

		if (ano >= 2004) {
			System.out.println("SEU VOTO NÃO É OBRIGATÓRIO");
		} else {
			System.out.println("SEU VOTO É OBRIGATÓRIO ");
		}
	}
}
