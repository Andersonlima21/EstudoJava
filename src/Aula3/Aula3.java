package Aula3;
import java.util.Scanner; // Importa a classe Scanner para capturar entrada do usuário.

public class Aula3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar entradas do teclado.
        Scanner leitura = new Scanner(System.in);

        System.out.println("Teste de captura telcado: ");

        String string = leitura.nextLine();
        int inteiro = leitura.nextInt();


        if (string.equals("Teste")) {
            System.out.println("Mensagem digitada (Dentro do if): " + string);
        } else {
            System.out.println("Mensagem digitada (Fora do If): " + string);
        }

        if (inteiro == 2) {
            System.out.println("Inteiro (Dentro do if): " + inteiro);
        } else {
            System.out.println("Inteiro (fora do if): " + inteiro);
        }


    }
}
