package Class5;

import java.awt.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your country: ");
        String country = input.nextLine();

        switch (country){
            case "Serbia":
                System.out.println("Your speak Serbian");
                break;
            case "USA":
                System.out.println("Your speak English");
                break;
            case "France":
                System.out.println("Your speak French");
                break;
            case "Germany":
                System.out.println("your speak German");
                break;
            case "Turkey":
                System.out.println("your speak Turkish");
                break;
            case "Finland":
                System.out.println("Your speak Finnish");
                break;
        }
    }
}
