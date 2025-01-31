public class Method_Class {
    public static void main(String[] args){
        int a = 30;
        multiplicationtable(a);
    }

    public static void multiplicationtable(int a){
        for(int i=1; i<=10;i++){
            System.out.println(a+"x"+i+"="+i*a);
        }
    }
}
