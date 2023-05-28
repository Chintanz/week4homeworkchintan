package javaprogrammeweek4;
/**Write a method called isPalindrome with one int parameter called number.
 The method needs to return a boolean.*/
 public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }




}
