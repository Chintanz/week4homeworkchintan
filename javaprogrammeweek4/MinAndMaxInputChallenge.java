package javaprogrammeweek4;
/**Read the numbers from the console entered by the user and print the minimum
 and maximum number the user has entered.*/
import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter a number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);
        scanner.close();
    }

}