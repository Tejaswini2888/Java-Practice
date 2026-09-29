public class BankAccount {
    int accountNumber;
    String holderName;
    int balance;
    BankAccount(int accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    void display(){
        System.out.println("Account number ="+accountNumber);
        System.out.println("Holder name ="+holderName);
        System.out.println("Balance ="+balance);
        System.out.println();
    }
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(119,"Teju",50000);
        BankAccount b2 = new BankAccount(207,"Teja",70000);
        BankAccount b3 = new BankAccount(120,"t",40000);
        b1.display();
        b2.display();
        b3.display();
    }
}
