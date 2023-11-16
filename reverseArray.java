import java.util.Arrays;

public class reverseArray {

    public static int[] reversArr(int xr[]){
        int temp [] = new int[xr.length];
        for(int i=0; i<xr.length;i++){
            temp[i] = xr[xr.length-(i+1)];
        }
        return temp;
    }
    public static void main(String[] args) {
        int xr [] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(Arrays.toString(xr));
        
        xr = reversArr(xr);
        reversArr(xr);
        System.out.println(Arrays.toString(xr));
    }
}
