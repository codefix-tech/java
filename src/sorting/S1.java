public class S1{
    public static void main(String [] arg){


        int [] arr = {2,3,1,4,2,3};

        for(int i = 0 ; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
              System.out.print("false " + " ");
                 break;
            }
            else 
           System.out.print("true " + " ");
        }
    }
}