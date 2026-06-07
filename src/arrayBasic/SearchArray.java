public class SearchArray{
    public static void main(String [] args){



        double [] arr = {0,33,22.22,12,3,5,3,4,3};
         
         int target = 22; 
       
        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]){
             
                System.out.println("Element present at index: " + i + " " +  "value : " + arr[i] );
                return;
            }
        }
        
            System.out.println("Element not present");
        
          
       // int [] arr = {2,3,33,22,11,44,33}



    }
}