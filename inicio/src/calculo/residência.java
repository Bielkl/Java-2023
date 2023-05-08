package calculo;

import java.util.Scanner;

public class residência {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorKwh = 0.60;

		System.out.print("Digite a quantidade de kWh consumidos no mês: ");
		int quantidadeKwh = sc.nextInt();
		sc.close();

		double valorConta = quantidadeKwh * valorKwh;
		valorConta += valorConta * 0.2; // imposto

		System.out.println("O valor da conta de luz é de R$ " + valorConta);
	}
}
