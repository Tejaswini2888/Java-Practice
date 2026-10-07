public class CompleteBankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public CompleteBankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposited="+amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawed="+amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        CompleteBankAccount c1 = new CompleteBankAccount("ACC1001","teju",4000);
        System.out.println("Account numbber ="+c1.accountNumber);
        System.out.println("Account holder="+c1.accountHolder);
        System.out.println("Balance="+c1.balance);
        c1.deposit(4000);
        c1.withdraw(3000);
        System.out.println("Final balance="+c1.getBalance());
    }
}
