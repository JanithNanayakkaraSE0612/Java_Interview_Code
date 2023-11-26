package PRF_Assignment.TakeHomeAssignment;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks =0,total=0;
        for(int i  = 1; i<4;i++){
            marks=input.nextInt();
            total+=marks;
            System.out.println("Marks is :"+marks);
        }
        System.out.println("Total is :"+total);
        double avg = total/3;
        System.out.println("Average is :"+avg);
    }
}
