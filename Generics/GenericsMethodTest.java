package Generics;

public class GenericsMethodTest {
    public static void main(String[] args) {
        //create array of integer , double , charachters
            Integer [] intArray = {1,2,3,4,5,6};
            Double [] doubleArray = {10.5 , 34.6,23.1,56.98,41.90};
            Character [] charArray = {'A','B','G','J'};


            System.out.println("Print IntegerArray :");
            printArray(intArray);
            System.out.println("Print Double Array : ");
            printArray(doubleArray);
            System.out.println("Print Charachter Array : ");
            printArray(charArray);
    }
    //Generics Method printArray (one method aLL types)
    public static <E> void printArray (E [] inputArray){
            //Display Array Element

            for(E element : inputArray){
                System.out.printf("%s", element);
            }
            System.out.println();
    }
}
