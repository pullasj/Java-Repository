package Thread;
class TestJoinThread extends Thread{
    public void run()   {
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName() + "Executing");
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Join_Main {
    public static void main(String[] args){
        TestJoinThread t1 = new TestJoinThread();
        TestJoinThread t2 = new TestJoinThread();
        t1.start();

        try {
            t1.join(400);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();
    }
}
