public class Estudo {
    public static void main(String[] args) {
        String aula1 = "Configurar ambiente de desenvolvimento (JDK 21, IDE Intellij) - Diferenças entre JVM, JRE, JDK - Primeiras classes";
        String jdk = "JDK (Java Development Kit) - Kit de Desenvolvimento Java responsável por compilar código-fonte em bytecode.";
        String jvm = "JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode";
        String jre = "JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa";

        System.out.println(aula1);
        System.out.println(jdk);
        System.out.println(jvm);
        System.out.println(jre);

        String aula2 = "A trabalhar com variáveis: recurso utilizado para armazenar valores em memória";
        String inteiros = "inteiros (byte, short, int, long";
        String pontoFlutuante = "ponto flutuante (double e float)";
        String cChar = "char: contém um único caractere"; // var com nome estranho para não pegar o nome reservado
        String bBolean = "boolean: recebe 2 valores, true ou false";
        String tiposPrimitivos = "Tipos primitivos: " + inteiros + " - " + pontoFlutuante + " - " + cChar + " - " + bBolean;
        String representacaoString = "Como representar textos em Java, utilizando a classe String";
        String casting = "A realizar casting de valores, para resolver situações de tipos incompatíveis no momento de realizar um cálculo ou atribuição de uma variáve";

        System.out.println(aula2);
        System.out.println(tiposPrimitivos);
        System.out.println(representacaoString);
        System.out.println(casting);

        String aula3 = "A configurar uma aplicação para que ela escolha entre executar uma ação ou outra baseada em algum elemento";
        String comparacoes = "Comparações para as condicionais: igual, diferente, maior, menor;";
        String leituraTeclado = "A usar a leitura do teclado com a classe Scanner;";
        String condicionais = "Trabalhar com alternativas para as condicionais e escolher a ideal para o caso escolhido";
        String looping = "A utilizar estruturas de repetição com for e while";

        System.out.println(aula3);
        System.out.println(comparacoes);
        System.out.println(leituraTeclado);
        System.out.println(condicionais);
        System.out.println(looping);
    }
}
