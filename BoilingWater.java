import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 212: ");
        double temperature = scanner.nextDouble();

        if (temperature > 212) {
            System.out.println("The water is boiling!");
        }
        scanner.close();
    }
}