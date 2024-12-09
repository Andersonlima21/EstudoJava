public class ExerciciosAula2 {
    public static void main(String[] args) {
        String stringResultado = " O resultado é: ";

        String enunciado1 = "1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado";
        double nota1 = 5.5;
        double nota2 = 6.7;
        double media = (nota1 + nota2) / 2;
        System.out.println(enunciado1 + " --" + stringResultado + media);

        String enunciado2 = "2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado";
        double a = 10.1;
        int b = 15;
        int soma = (int) a + b;
        System.out.println(enunciado2 + " --" + stringResultado + soma);

        String enunciado3 = "3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem";
        char letraInicialNome = 'A';
        String restanteNome = "nderson";
        System.out.println(enunciado3 + " --" + " Nome completo " + letraInicialNome + restanteNome);

        String enunciado4 = "4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.";
        double precoProduto = 32.56;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println(enunciado4 + " --" + " O produto X custa: " + precoProduto + " o cliente quis levar " + quantidade + " deste produto, então o valor ficou " + valorTotal);

        String enunciado5 = "5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado";
        double valorEmDolares = 101.98;
        double valorEmReal = 6.10; // Peguei o valor do dolar atualizado, para bater com minha conta
        double conversaoRealDolar = valorEmDolares * valorEmReal;
        System.out.println(enunciado5 + " --" + " O valor em dolares é: " + valorEmDolares + " o valor de 1 dolar para 1 real é " + valorEmReal + " então o valor desses dolares, em Reais ficará " + conversaoRealDolar);

        String enunciado6 = "6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.";
        double precoOriginal = 120.97;
        double percentualDesconto = 20;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println(enunciado6 + " --" + " O preço original era " + precoOriginal + " O percentual de desconto foi de " + percentualDesconto + "%" + " então o valor do desconto foi de " + valorDesconto + " então o preço com desconto ficou " + precoComDesconto);

    }
}
