import java.util.Scanner;

public class Ex5 {
    //faça um progama que peça a temperatura em fahrenheit.
    //transforme e mostre a temperatura em graus Celsius.
    public static void main(String []arg){

        Scanner entrada =new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit:");
        double f = entrada.nextDouble();
        double temperaturaCelsius = (f-32) / 1.8;
        System.out.printf("O resultado da conversão é: %.3f",temperaturaCelsius);





    }






}
