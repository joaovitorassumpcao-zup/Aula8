import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura ºF: ");
        float fahrenheit = scanner.nextFloat();
        System.out.print(fahrenheit + "ºF são " + ((fahrenheit - 32) * 5 / 9) + "ºC.");
    }
}
