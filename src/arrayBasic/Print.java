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
        
    }
}