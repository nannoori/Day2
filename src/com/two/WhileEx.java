package com.two;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
     /*   int i = 0;
        while (i <= 10) {
            System.out.println("value of i " + i);
            i += 2;
     */
       /* int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int number = input.nextInt();

        while (number >= 0) {
            sum += number;
            number--;
        }

        System.out.println("sum of elements " + sum);
 */

      /*  int i = 0;
        do {
            System.out.println("Value of i " + i);
            i++;
        } while (i <= 10);
        System.out.println("i is" + i);
    }*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        char ch;

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        int choice;
        do {
            System.out.println("1] Addition\n2] Subtraction\n3] Mulitplication\n4] Division\n\nEnter your choice\n");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition -> " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Subtraction -> " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplcation -> " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division -> " + (float) (num1 / (float) num2));
                    break;
            }

            System.out.println("Do you want to continue....");
            ch = input.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

    }
}