class BankAccount{
  int accNo;
  double balance;
  BankAccount(int a, double b){
    accNo = a;
    balance = b;
  }
  void deposit(double amount){
    balance = balance + amount;
    System.out.println("Deposited: " + amount);
  }
  void withdraw(double amount){
    if (amount <= balance){
      balance = balance - amount;
      System.out.println("Withdrawn: " + amount);
    } 
    else{
      System.out.println("Insufficient balance");
    }
  }
  void display(){
    System.out.println("Account No: " + accNo);
    System.out.println("Balance: " + balance);
  }
}
public class R192311291{
  public static void main(String[] args) {
    BankAccount b = new BankAccount(101, 5000);
    b.deposit(2000);
    b.withdraw(3000);
    b.display();
  }
}
