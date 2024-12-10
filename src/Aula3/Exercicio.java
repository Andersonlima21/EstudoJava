package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int tentativas = 0;
        int valorInputado = 0;

        // Gera um número aleatório entre 0 e 100.
        int valorRadon = random.nextInt(100);

        System.out.println(valorRadon); // var para ver qual número gerado e testar as regras

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem 5 tentativas.");

        // Loop para as tentativas.
        while (tentativas < 5 && valorInputado != valorRadon) {
            System.out.print("Digite seu palpite: ");
            valorInputado = leitura.nextInt();

            if (valorInputado < valorRadon) {
                System.out.println("O número é maior que " + valorInputado);
            } else if (valorInputado > valorRadon) {
                System.out.println("O número é menor que " + valorInputado);
            } else {
                // em caso de acerto
                System.out.println("Parabéns! Você acertou o número " + valorRadon + "!");
                break;
            }

            tentativas++;

            // Exibe quantas tentativas ainda restam.
            System.out.println("Você tem " + (5 - tentativas) + " tentativa(s) restante(s).");
        }

        // Se o usuário não acertar após as 5 tentativas, exibe a mensagem de fim.
        if (valorInputado != valorRadon) {
            System.out.println("Que pena! Você não acertou. O número era " + valorRadon + ".");
        }

        leitura.close();
    }
}
