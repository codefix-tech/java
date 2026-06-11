// print 1 to n number by recurson
import java.util.Scanner;

public class PrintNTo1{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Number to Print Upto  : ");
     
         int n = sc.nextInt();
         print(n,n);
    }
       static void print(int i,int n){
             if(i<1)
                return;

             System.out.print(i);
                 
             print(i-1,n);
   }

}