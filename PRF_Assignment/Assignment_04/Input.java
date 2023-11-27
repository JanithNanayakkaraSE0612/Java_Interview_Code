package PRF_Assignment.Assignment_04;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First Number is :");
        int fisrt = input.nextInt();
        System.out.println("Second Number is :");
        int Second = input.nextInt();

        if (fisrt<Second) {
            int total = fisrt+Second;
            System.out.println("added two numbers :"+total);
        }else{
            System.out.println("First Nubmer is :"+fisrt+"Second Number is :"+Second);
        }
    }
}
