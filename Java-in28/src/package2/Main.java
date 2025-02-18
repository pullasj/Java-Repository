package package2;

public class Main {
    public static void main(String[] args){
        Bankaccount bankaccount = new Bankaccount("42343",3424.64);
        System.out.println("Account number: "+bankaccount.GetAccountNumber()+ " balance " +bankaccount.GetBalance());
        System.out.println();
        bankaccount.WithdrawAmmont(342);
        System.out.println("Account number: "+bankaccount.GetAccountNumber()+ " balance " +bankaccount.GetBalance());
    }

}
