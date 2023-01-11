package Class5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number:");
        double num1 = input.nextDouble();
        System.out.println("Please enter +, _, *, /");
        char calculator =input.next().charAt(0);
        System.out.println("please enter the second number");
        double num2 = input.nextDouble();

        if (calculator == '+') {
            System.out.println("result is "+ (num1+num2));
        } else if (calculator == '-') {
            System.out.println("result is "+ (num1-num2));
        } else if (calculator == '*') {
            System.out.println("result is "+ (num1*num2));

        } else if (calculator == '/') {
            System.out.println("result is "+ (num1/num2));

        }
    }
}








