import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int i = 1;
        long factorial = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }

        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}