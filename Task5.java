package Class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 different number:");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("num1 is the largest");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is the largest");

        } else if (num3>num1 && num3>num2) {

            System.out.println("num3 is the largest");

        }

    }
}
