package Class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.nextLine();

        switch (month){
            case "December":
            case "January":
            case "February":
                System.out.println("season is "+ "Winter");
             break;
            case "March":
            case "April":
            case "May":
                System.out.println("season is "+ "Spring");
                break;
            case "Jun":
            case "Julay":
            case "Avgust":
                System.out.println("season is "+ "Summer");
            case "September":
            case "October":
            case "November":
                System.out.println("season is "+ "Fall");
                break;
        }
    }
}
