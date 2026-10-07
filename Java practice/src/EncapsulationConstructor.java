public class EncapsulationConstructor {
     private  String accountNumber;
     private  double balance;
     EncapsulationConstructor(String accountNumber,double balance){
          this.accountNumber=accountNumber;
          this.balance=balance;
     }
     public double getBalance(){
          return balance;
     }
     public static void main(String[] args){
          EncapsulationConstructor e1 = new EncapsulationConstructor("ACC1001",50000);
          System.out.println("Account NUmber ="+e1.accountNumber);
          System.out.println("Balance="+e1.getBalance());
     }


}
