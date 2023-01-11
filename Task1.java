package Class5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the height in inches");

        int height = input.nextInt();

        if (height<60){
            System.out.println("short");
        } else if (height>60 && height<72) {
            System.out.println("medium");
        }else {
            System.out.println("tall");
        }
    }
}
