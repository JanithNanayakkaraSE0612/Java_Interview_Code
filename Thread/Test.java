package Thread;

public class Test {
    public static void main(String[] args) {
        ThreadFirst first = new ThreadFirst();
        ThreadSecond second = new ThreadSecond();
        Thread thread = new Thread(second);
        first.start();
        thread.start();
        
    }
}
