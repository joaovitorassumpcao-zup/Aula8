import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Converter metros para centímetros\n Metros: ");
        float metros = scanner.nextFloat();
        System.out.print("Convertido para " + (metros * 100) + " centímetros.");
    }
}
