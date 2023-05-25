import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Ex4 {


    //Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
    //    Calcule e mostre o total do seu salário no referido mês./


    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        double ganhaporhora = entrada.nextDouble();

        System.out.println("Horas trabalhadas no mês?");
        double horastrabalhadas = entrada.nextDouble();

        double salariototal = ganhaporhora *horastrabalhadas;

        System.out.printf("O seu salário esse mês é: %,.2f ", salariototal);




        }


    }

