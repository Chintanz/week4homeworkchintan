package javaprogrammeweek4;

import java.util.Scanner;

/**Write a program to input any number and check if it Armstrong number or not
 153 = (1*1*1)+(5*5*5)+(3*3*3)
 where:
 (1*1*1)=1
 (5*5*5)=125
 (3*3*3)=27
 So:
 1+125+27=153*/
public class Prog10ArmstrongNumber {
    public static void main(String[] args) {

        int num, originalNum, remainder, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        num = sc.nextInt();
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        sc.close();

    }

    }



