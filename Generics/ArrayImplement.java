package Generics;

public class ArrayImplement {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Creating an integer array of size 5


        // Accessing elements
        arr[0] = 10; // Assigning value 10 to the first element
        arr[1] = 5;
        int value = arr[2]; // Accessing the third element
        System.out.println("value: " + value);
       
       
        // Iterating through the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       
    }
}
