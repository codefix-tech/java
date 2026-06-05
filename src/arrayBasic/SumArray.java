import java.util.Scanner;
public class SumArray{
    public static void main(String [] arg){
      
      Scanner sc = new Scanner(System.in);
      int sum = 0 ;
      
      System.out.print("Enter Size OF Array : ");
      int n = sc.nextInt();
      int [] arr = new int[n];
       
         System.out.print("Element of Array : ");

         for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
         }

         for(int i = 0 ; i <= n ; i++){
            sum+=i;
            }
            System.out.print(sum);
    }
}