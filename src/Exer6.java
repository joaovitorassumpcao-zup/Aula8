
// 6 - Faça um programa que leia um número inteiro e
// imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int num = scanner.nextInt();
        System.out.print("Antecessor: " + (num - 1)
                + "\nNúmero: " + num
                + "\nSucessor: " + (num + 1));
    }
}
