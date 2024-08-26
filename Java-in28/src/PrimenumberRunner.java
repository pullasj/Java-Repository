public class PrimenumberRunner {
    private int num;
    PrimenumberRunner(int num){
        this.num = num;
        isprime(num);
    }
    void isprime(int num){
        int check=0;
        for(int i=2;i<num;i++)
        {
            if (num%i==0){
                check++;
            }
        }
        if(check==0)
        System.out.println("is Prime");
        else
            System.out.println("not Prime");
    }

}
