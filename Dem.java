public class Dem {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the pattern size

        int i = rows;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("+");
                j++;
            }
            System.out.println();
            i--;
        }

        i = 2;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("+");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}