//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    // String palindrome checker
    public static boolean checkStringPalindrome(String text) {

        text = text.toLowerCase();

        String reversed = new StringBuilder(text).reverse().toString();

        return text.equals(reversed);
    }

    // Number palindrome checker
    public static boolean checkNumberPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PALINDROME CHECKER =====");
        System.out.println("1. Check String");
        System.out.println("2. Check Number");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter a string: ");
                String text = sc.nextLine();

                if (checkStringPalindrome(text)) {
                    System.out.println("It is a Palindrome!");
                } else {
                    System.out.println("It is NOT a Palindrome!");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                if (checkNumberPalindrome(number)) {
                    System.out.println("It is a Palindrome!");
                } else {
                    System.out.println("It is NOT a Palindrome!");
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}