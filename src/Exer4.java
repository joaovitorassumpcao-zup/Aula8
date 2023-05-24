
// 4 - Faça um Programa que recebe o quanto você ganha por hora
// e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
// salário no referido mês.

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calculadora de salário mensal\nSalário por hora: ");
        float salarioHora = scanner.nextFloat();
        System.out.print("Horas trabalhadas no mês: ");
        int horasMes = scanner.nextInt();
        System.out.print("Você recebe " + (salarioHora * horasMes) + " por mês.");
    }
}
