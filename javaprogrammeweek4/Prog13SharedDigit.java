package javaprogrammeweek4;
/** Write a method named hasSharedDigit with two parameters of type int.
 Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.*/

public class Prog13SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(14, 19));
    }
    public static boolean hasSharedDigit(int a, int b) {
        int lefta = a / 10;
        int righta = a % 10;
        int leftb = b / 10;
        int rightb = b % 10;
        return lefta == leftb || lefta == rightb || righta == leftb
                || righta == rightb;

    }
}