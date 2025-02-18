package Thread;
class ExampleThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Example thread is running");
    }
}
public class Main {
    public static void main(String[] args){
        Thread thread = new Thread(new ExampleThread(), "Example Thread");
        thread.start();

        System.out.println("Thread name is: " +thread.getName());
    }
}
