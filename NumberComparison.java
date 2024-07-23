import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The first is greater than the second");
        } else if (num1 < num2) {
            System.out.println("The second is greater than the first");
        } else {
            System.out.println("The first and the second are equal");
        }

        scanner.close();
    }
}
