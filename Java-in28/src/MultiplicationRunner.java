public class MultiplicationRunner {
    void print(){
        print(5, 1, 10) ;
    }
    void print(int x){
        print(x, 1, 10);
    }
    void print(int x, int y, int z)
    {
        for (; y<=z;y++)
        {
            //5*10=50
            System.out.printf("%d * %d = %d",x,y,x*y).println();
        }
    }
}
