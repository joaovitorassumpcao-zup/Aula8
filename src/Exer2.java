import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, nota4;
        System.out.print("Calculadora de Média\n1ª nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("2ª nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("3ª nota: ");
        nota3 = scanner.nextFloat();
        System.out.print("4ª nota: ");
        nota4 = scanner.nextFloat();
        System.out.print("Média: " + ((nota1 + nota2 + nota3 + nota4) / 4));
    }
}
