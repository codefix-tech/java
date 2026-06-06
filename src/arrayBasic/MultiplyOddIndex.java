public class MultiplyOddIndex{
    public static void main(String [] args){

        int [] arr = {10,20,1,2,99};
         int odd = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(i % 2 != 0){
               odd =  2 * arr[i]; 
                System.out.print(odd + " ");
            }
            else{
                arr[i] += 10;
                System.out.print(arr[i] + " ");
            }
           
        }
        
    }
}