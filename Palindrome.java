import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a string : ");
        String input=scanner.nextLine();

        boolean isPalindrome = palindrome(input);
        System.out.println(isPalindrome);
    }
    public static boolean palindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}