public class BankAccountClass {
    long accountNumber;
    String accountHolder;
    double balance;
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited="+amount);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance = balance-amount;
            System.out.println("Withdrawed="+amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void displayBalance(){
        System.out.println("Account number="+accountNumber);
        System.out.println("Account holder="+accountHolder);
        System.out.println("Current balance="+balance);
    }
    public static void main(String[] args){
        BankAccountClass b1 = new BankAccountClass();
        b1.accountNumber = 1001;
        b1.accountHolder = "Teju";
        b1.balance = 5000;
        System.out.println("Initial Account Details:");
        b1.displayBalance();
        System.out.println();
        b1.deposit(2000);
        b1.withdraw(1500);
        System.out.println();
        System.out.println("Final account detailsL:");
        b1.displayBalance();
    }
}
