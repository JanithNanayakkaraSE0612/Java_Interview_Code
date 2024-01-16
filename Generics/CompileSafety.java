package Generics;

import java.util.ArrayList;

public class CompileSafety {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add("Janith");
        arrayList.add(1223);
        
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add("Janith"); // with generics Compile time error
    }

}
