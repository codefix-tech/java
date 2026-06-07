public class Product{
    public static void main(String [] arg){


        int [] arr = {2,3,4,5,};
        int prod = 1;
        for(int i = 0 ; i < arr.length ; i++){
          prod *= arr[i];

        }
        System.out.print(prod);
    }
}