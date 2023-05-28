package javaprogrammeweek4;
/**Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 The method needs to find the first and the last digit of the parameter number passed to the method,
 using a loop and return the sum of the first and the last digit of that number.*/
 public class Pro7FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(156789));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >=10) {
            number /=10;
    }
        return lastDigit + number;
    }

}
