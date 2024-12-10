package Aula3;

import java.util.Scanner;

// Laço de soma infinita, até cumprir a condição de saida do looping

public class LoopingWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaNota = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Valor para somar na media / ou digite -1 para encerrar: ");

            nota = leitura.nextDouble();

            if (nota == -1) {
                continue;
            }
            mediaNota += nota;
            totalNotas++;
        }


        System.out.println("Media final: " + mediaNota / totalNotas);
    }
}
