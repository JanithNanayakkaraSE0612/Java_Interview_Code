public class reverseString {
    public static void main(String[] args) {
        String name = "Janith" ,revName="";
        char ch;
        System.out.println(name);
        for(int i =0; i<name.length();i++){
            ch = name.charAt(i);
            revName=ch+revName;
        }
        System.out.println("Reversed Name :"+revName);
    }
}
