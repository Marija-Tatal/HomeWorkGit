package Class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 different number:");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3 = input.nextInt();

       if(num1>num2){
           if (num2>num3){
               System.out.println("num1 is the largest");
           }else {
               System.out.println("num3 is largest");
           }
       } else if (num2>num1) {
           System.out.println("num2 is largest");

       } else if (num2>num3) {
           System.out.println("num3 is largest");

       }else {
           System.out.println("num3 is largest");
       }
    }
}