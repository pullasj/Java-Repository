package Thread;
import java.util.*;
class TestThreadSleep extends Thread{
    @Override
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println("TestThreadSleep Thread is executed ");
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class MainSleep {
    public static void main(String[] args){
        TestThreadSleep thread = new TestThreadSleep();
        thread.start();
    }
}
