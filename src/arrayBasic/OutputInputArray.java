import java.util.Scanner;

public class OutputInputArray{
    public static void main(String [] arg){
        
        // print all element

        // int [] arr = {1,2,43,45,55,66};

        // for(int i = 0 ; i <= 5 ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.print(" Size of Array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter Array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt(); 
           
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }





         
    }
}