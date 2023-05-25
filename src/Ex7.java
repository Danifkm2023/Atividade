import java.util.Scanner;

public class Ex7 {

//Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês,
//sabendo-se que são descontados 11% para o Imposto de Renda,
//8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
//salario bruto?
//quanto pagou inss?
//quanto pagou ao sindicato?
//qual o salario liquido do funcionario?
    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);
        double taxasInss = 0.08;
        double taxaIr =  0.11;
        double taxadosindicato = 0.5;

        System.out.println("quanto você ganha por hora?");
        double ganhaporhora = entrada.nextDouble();

        System.out.println("horas trabalhadas mensal?");
        double horastrabalhadas = entrada.nextDouble();
        double salariobruto = ganhaporhora * horastrabalhadas;

        System.out.printf("O seu salario no mes é: %,.2f %n", salariobruto);

        double pagamentoInss = salariobruto * taxasInss;
        System.out.printf("O desconto do INSS foi: %,.2f %n", pagamentoInss);

        double pagamentoSindicato = salariobruto * taxadosindicato;
        System.out.printf("O desconto do sindicato é: %,.2f %n", pagamentoSindicato);

        double pagamentoIr = salariobruto * taxaIr;
        System.out.printf("O desconto do IR é: %,.2f %n", pagamentoIr);

        double salarioLiquido = salariobruto - pagamentoInss - pagamentoSindicato - pagamentoIr;
        System.out.printf("O seu salário líquido é: %,.2f %n", salarioLiquido);



    }


}
