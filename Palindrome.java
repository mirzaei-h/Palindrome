import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("PLZ enter string: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Integer size = input.length();
        if (isPalindrome(input, size)) {
            System.out.println("It is palindrome.");
        } else {
            System.out.println("It is not palindrome.");
        }
        s.close();
    }

    public static boolean isPalindrome(String input, Integer size) {
        for (Integer i = 0; i < size / 2; i++) {
            if (input.charAt(i) != input.charAt(size - i - 1)) {return false;}
        }
        return true;
    }
}