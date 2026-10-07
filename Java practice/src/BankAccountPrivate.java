public class BankAccountPrivate {
    private double balance;
    void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount deposited="+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        BankAccountPrivate b1 = new BankAccountPrivate();
        b1.deposit(5000);
        b1.deposit(2000);
        System.out.println("Balance="+b1.getBalance());
    }
}
