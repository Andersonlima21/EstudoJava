package Aula3;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaNota = 0;
        double nota = 0;

        for (int i = 0; i < 4; i++) {

            String bimestre = switch (i) {
                case 0 -> "Bimestre 1";
                case 1 -> "Bimestre 2";
                case 2 -> "Bimestre 3";
                case 3 -> "Bimestre 4";
                default -> "Bimestre desconhecido, sai dessa cara";
            };

            System.out.println("Qual sua nota do " + bimestre + "?");

            nota = leitura.nextDouble();
            mediaNota += nota;
        }

        System.out.println("Media final: " + mediaNota / 4);

    }
}
