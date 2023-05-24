
// 7 - Faça um Programa que receba o quanto você ganha por hora e o
// número de horas trabalhadas no mês. Calcule e mostre o total do seu
// salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
// a. Salário bruto.
// b. Quanto pagou ao INSS.
// c. Quanto pagou ao sindicato.
// d. Qual o salário líquido do funcionário.

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSalário por hora: ");
        float salarioHora = scanner.nextFloat();
        System.out.print("Horas trabalhadas no mês: ");
        int horasMes = scanner.nextInt();
        float salarioMesBruto = salarioHora * horasMes;
        float impostoRenda = (float) (salarioMesBruto * 0.11);
        float impostoINSS = (float) (salarioMesBruto * 0.08);
        float impostoSindicato = (float) (salarioMesBruto * 0.05);
        float salarioLiquido = ((salarioMesBruto - impostoRenda) - impostoINSS) - impostoSindicato;
        System.out.println("Salário bruto: " + salarioMesBruto);
        System.out.println("Imposto de renda: " + impostoRenda);
        System.out.println("Imposto ao INSS: " + impostoINSS);
        System.out.println("Imposto ao sindicato: " + impostoSindicato);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
