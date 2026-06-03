import java.util.Arrays;
public class Print{
    public static void main(String [] arg){

        int [] arr = {2,3,45,6,3,7,3,8,4};
        System.out.println("First element of array :  " + arr[0]);
        System.out.println("Last element of array :  "  + arr[arr.length-1]);
        System.out.println("Length of array : " + arr.length);
        
                System.out.println("Element of array : " + Arrays.toString(arr) );
      

       System.out.print("Element of array : ");
      
        for(int i = 0; i<arr.length;i++){
                       
            System.out.print(arr[i] + " ");
        }
           
           System.out.println(" ");

            System.out.print("Indexes of array : ");
      
        for(int i = 0; i<arr.length;i++){
                       
            System.out.print(i + " ");
        }


        // reverse array 
        System.out.println(" ");

        System.out.print("reverse element : ");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }


        // print even and odd numbers
        System.out.println(" ");
        
        System.out.print("Even numbers: "); 
        for(int k = 0 ; k < arr.length; k++){
            if(arr[k] % 2 == 0){
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for(int k = 0 ; k < arr.length; k++){
            if(arr[k] % 2 != 0){
                System.out.print(arr[k] + " ");
            }
        }

       















         System.out.println(" ");


        System.out.print("Element of array using while loop : ");
        int j = 0;
        while(j< arr.length){
            System.out.print(arr[j] + " ");
            j++;
            
        }

        
    }
}