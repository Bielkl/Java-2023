package resultadoFinal;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Leitura do salário atual
		System.out.print("Digite o salário atual do colaborador: ");
		double salarioAtual = sc.nextDouble();

		// Cálculo do reajuste de acordo com a faixa salarial
		double salarioNovo;
		if (salarioAtual <= 280.0) {
			salarioNovo = salarioAtual * 1.2;
		} else if (salarioAtual <= 700.0) {
			salarioNovo = salarioAtual * 1.15;
		} else if (salarioAtual <= 1500.0) {
			salarioNovo = salarioAtual * 1.1;
		} else {
			salarioNovo = salarioAtual * 1.05;
		}

		// Exibição do resultado
		System.out.printf("O novo salário do colaborador será de R$ %.2f", salarioNovo);
	}
}
