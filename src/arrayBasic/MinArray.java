public class MinArray{
    public static void main(String [] arg){

        int [] arr  = {2,-1,0,5,4,3,55,66};
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                      min = arr[i];
                }
            }
              System.out.print(min);
         }
    }
