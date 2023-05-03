package inicio1;

import java.util.Scanner;
import java.util.Random;

public class ImparPar {

	private int jogadorAtual;
	private int pontosJogador1;
	private int pontosJogador2;

	public ImparPar() {
		jogadorAtual = 1;
		pontosJogador1 = 0;
		pontosJogador2 = 0;
	}

	public void jogar(String escolha, int numero) {
		Random random = new Random();
		int numeroAleatorio = random.nextInt(11);

		int soma = numero + numeroAleatorio;

		System.out.println("Número escolhido pelo jogador " + jogadorAtual + ": " + numero);
		System.out.println("Número aleatório gerado: " + numeroAleatorio);
		System.out.println("Soma: " + soma);

		if (soma % 2 == 0 && escolha.equals("par") || soma % 2 == 1 && escolha.equals("ímpar")) {
			System.out.println("Jogador " + jogadorAtual + " acertou!");
			if (jogadorAtual == 1) {
				pontosJogador1++;
			} else {
				pontosJogador2++;
			}
		} else {
			System.out.println("Jogador " + (jogadorAtual == 1 ? 2 : 1) + " acertou!");
		}

		System.out.println("Pontuação: Jogador 1 = " + pontosJogador1 + ", Jogador 2 = " + pontosJogador2);

		if (pontosJogador1 >= 3 || pontosJogador2 >= 3) {
			System.out.println("Fim de jogo!");
		} else {
			jogadorAtual = jogadorAtual == 1 ? 2 : 1;
		}
	}

	public static void main(String[] args) {
		ImparPar jogo = new ImparPar();
		Scanner sc = new Scanner(System.in);

		while (jogo.pontosJogador1 < 3 && jogo.pontosJogador2 < 3) {
			System.out.print("Jogador " + jogo.jogadorAtual + ", escolha ímpar ou par: ");
			String escolha = sc.next();
			System.out.print("Jogador " + jogo.jogadorAtual + ", digite um número:");
			int numero = sc.nextInt();
			jogo.jogar(escolha, numero);

		}
	}
}
