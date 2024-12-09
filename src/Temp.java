public class Temp {
    public static void main(String[] args){
        // Meu codigo
        double temperaturaCelsius = 26.10;
        double valorDaFormula = 1.8;
        double temperaturaFar = (temperaturaCelsius * valorDaFormula) + 32;

        String msg = ("A temperatura Celsius de " + temperaturaCelsius + " em Fahrenheit é: " + temperaturaFar);
        System.out.println(msg);

        int temperaturaFarInt = (int) temperaturaFar;

        String msg2 = ("A temp em Fahrenheit convertida para int: " + temperaturaFarInt);
        System.out.println(msg2);

        // Codigo exemplo da aula
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
