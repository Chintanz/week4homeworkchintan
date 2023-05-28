package javaprogrammeweek4;

public class Prog14Diamond {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int j = 1;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= 2 * i - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i >= 1) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= 2 * i - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;

        }
    }
}