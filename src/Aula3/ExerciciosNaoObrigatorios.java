package Aula3;

import java.util.Scanner;

public class ExerciciosNaoObrigatorios {
    public static void main(String[] args) {
        // 1- Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo"
        Scanner leitura = new Scanner(System.in);
        int valorPositivoOrNegativo;

        System.out.println("Digite um número para sabermos se é positivo ou negativo:");
        valorPositivoOrNegativo = leitura.nextInt();

        if (valorPositivoOrNegativo >= 0) {
            System.out.println("O número " + valorPositivoOrNegativo + " é positivo");
        } else {
            System.out.println("O número " + valorPositivoOrNegativo + " é negativo");
        }

        // 2- Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior
        int numeroInteiro1;
        int numeroInteiro2;

        System.out.println("Numero 1: ");
        numeroInteiro1 = leitura.nextInt();
        System.out.println("Numero 2: ");
        numeroInteiro2 = leitura.nextInt();

        if (numeroInteiro1 == numeroInteiro2) {
            System.out.println("Numeros inteiros iguais");
        } else if (numeroInteiro1 > numeroInteiro2) {
            System.out.println("Primeiro número maior que o segundo");
        } else {
            System.out.println("Primeiro número menor que o segundo");
        }

        // 3 - Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("Se você deseja calcular a área do quadrado digite 1, caso deseje calcular a área do círculo digite 2");

        // Captura a opção escolhida pelo usuário.
        System.out.print("Selecione: ");
        int opcaoEscolhida = leitura.nextInt();

        if (opcaoEscolhida == 1) {
            // Cálculo da área do quadrado.
            System.out.println("Digite o valor do lado do quadrado: ");
            double lado = leitura.nextDouble();

            // Área do quadrado: lado².
            double areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é: " + areaQuadrado);

        } else if (opcaoEscolhida == 2) {
            // Cálculo da área do círculo.
            System.out.println("Digite o valor do raio do círculo: ");
            double raio = leitura.nextDouble();

            // Área do círculo: π * raio².
            double areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.println("A área do círculo é: " + areaCirculo);

        } else {
            // Opção inválida.
            System.out.println("Opção inválida. Por favor, escolha 1 para quadrado ou 2 para círculo.");
        }

        // 4 -Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.print("Digite um número para exibir a tabuada: ");
        int numeroTabuada = leitura.nextInt();

        System.out.println("Tabuada de " + numeroTabuada + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        // 5- Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.print("Digite um número para sabermos se é par ou impar: ");
        int numeroParImpar = leitura.nextInt();

        if (numeroParImpar % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        // 6- Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        // Solicita o número ao usuário.
        System.out.print("Digite um número para calcular o fatorial: ");
        int numeroFatorial = leitura.nextInt();

        if (numeroFatorial < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            // Calcula o fatorial.
            long fatorial = 1; // `long` para lidar com números grandes.
            for (int i = 1; i <= numeroFatorial; i++) {
                fatorial *= i;
            }

            // Exibe o resultado.
            System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);
        }

    }
}
