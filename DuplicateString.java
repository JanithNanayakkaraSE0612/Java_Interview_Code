public class DuplicateString {
    public static void main(String[] args) {
        String str = "goviyapana ahangama";
        char [] carray = str.toCharArray();
        System.out.println("The String is"+str);
        for(int i = 0; i<str.length();i++){
            for(int j = i+1; j<str.length();j++){
                if (carray[i] == carray[j]) {
                    System.out.println(carray[j]+" ");
                    break;
                }
            }
        }
    }
}
