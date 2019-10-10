package recap_exercises;

import java.util.Scanner;

public class Ex02PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word to check: ");
        String wordToCheck = scanner.nextLine();
        if(wordToCheck.length() != 0){
            System.out.println(isStringPalindrome(wordToCheck));
            System.out.println(isStringPalindromeBetter(wordToCheck));
        }
    }

    private static boolean isStringPalindrome(String wordToCheck) {
        boolean isPalindrome = true;
        int wordLength = wordToCheck.length()-1;
        for (int i = 0; i < wordToCheck.length()/2; i++) {
            if(wordToCheck.charAt(i) != wordToCheck.charAt(wordLength-i)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static boolean isStringPalindromeBetter(String wordToCheck){
        return wordToCheck.equals(new StringBuilder(wordToCheck).reverse().toString());
    }
}
