/**
 * swapVariable
 */
public class swapVariable {
    public static void main(String args[]){
    int j = 100;
    int g = 200;
    System.out.println("a is :"+j+"b is :"+g);
    int temp = j;
    j=g;
    g=temp;
    System.out.println("a is : "+j+"b is :"+g);

    int a = 10;
	int b = 20;

    System.out.println("a is " + a + " and b is " + b);

	a = a + b;
	b = a - b;
	a = a - b;

    System.out.println("After swapping, a is " + a + " and b is " + b);
    
    }
  
}