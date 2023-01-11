package Class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int day =7;
        System.out.println("Please enter the number");
        day= scan.nextInt();

        if(day>=1 &&day <+5){
            System.out.println("Weekday");
        } else if (day ==6 || day ==7) {
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid day");
        }


    }
}
