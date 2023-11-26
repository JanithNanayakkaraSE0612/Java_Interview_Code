package PRF_Assignment;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter is Ounce : " );
        int ounce = scanner.nextInt();

        double grams = ounce*28.3495;
        System.out.println("Output is :"+grams);

    }
}
