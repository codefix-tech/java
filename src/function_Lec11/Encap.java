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

class Students{

   private String name;
   private int age;
   private int rollNumber;
   private String college;
   
   Students(String name, int age , int rollNumber, String college){
    this.name=name;
    this.age=age;
    this.rollNumber=rollNumber;
    this.college=college;
    
   }

}