package PRF_Assignment.Assignment_04;

import java.util.Scanner;

public class input01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer is :");
        int number = input.nextInt();
        int absValue;
        if (number>=0) {
            absValue=number;
        }else{
            absValue=-number;
        }
        System.out.println("The absolute is :"+number+"absolute value"+absValue);
    }
}
