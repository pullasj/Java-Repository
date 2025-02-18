package package2;

public class Bankaccount {
    private String accountNumber;
    private double Balance;

    public Bankaccount(String accountNumber, double Balance){
        this.accountNumber = accountNumber;
        this.Balance = Balance;
    }
    public String GetAccountNumber(){
        return accountNumber;
    }
    public double GetBalance(){
        return Balance;
    }

    public boolean WithdrawAmmont(double ammount){
        if(Balance>=ammount){
            Balance = Balance - ammount;
            return true;
        }
        else {
            System.out.println("Not have enough balance");
            return false;
        }
    }
}

