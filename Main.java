import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scanner.nextLine();

        String reversed = reverseInput (input);
        System.out.println("Reversed string : " +reversed);
    }

    public static String reverseInput(String input)  {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();

    }
}

