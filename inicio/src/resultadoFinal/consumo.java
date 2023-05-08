package resultadoFinal;

import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Digite a distância total percorrida em km: ");
		int distanciaPercorrida = sc.nextInt();

		System.out.print("Digite o total de combustível gasto em litros: ");
		double combustivelGasto = sc.nextDouble();

		sc.close();
		// Cálculo do consumo médio
		double consumoMedio = distanciaPercorrida / combustivelGasto;

		
		if (distanciaPercorrida >= combustivelGasto) {
			System.out.println("Autonomia legal " + consumoMedio + " km/L.");
		} else {
			System.out.println("esse carro bebe hein!! " + consumoMedio + " km/L.");

		}
	}
}