public class Encap{
    public static void main(String [] args){
       
       BankAccount ba = new BankAccount();

       ba.depositeBalance(1000);
       ba.withdrawBalance(500);
       System.out.print(ba.checkBalance());

    }
}

class BankAccount {
    private double balance;

    void depositeBalance(int amount){
        balance += amount;
    }

    void withdrawBalance(int amount){
        balance -= amount;
    }

    double checkBalance(){
        return balance;
    }
}