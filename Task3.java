package Class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you quiz score");
        int qiz = scan.nextInt();
        System.out.println("Enter your midterm score");
        int mid=scan.nextInt();
        System.out.println("Enter your final score");
        int fin=scan.nextInt();

       int average=(qiz+mid+fin)/3;
        System.out.println("your average score is: "+ average);

        if (average>=90){
            System.out.println("Garde A");
        } else if (average>+70 && average<90) {
            System.out.println("Garde B");

        }else if (average>=50 && average<70){
            System.out.println("Garde C");
        }else {
            System.out.println("Garde F");
        }
    }
}
