package Generics;

public class GenericsIMPL {
    public static void main(String[] args) {
        Common <Integer> common = new Common<>(10);
        common.print();
        Common<String> StringCommon = new Common<>("Janith");
        StringCommon.print();       
    }
      
}
class Common<T>{
    T t;

    public Common (T t){
           this.t = t;
    }
    void print(){
       System.out.println(t);
    }
}
