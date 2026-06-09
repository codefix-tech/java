public class P2{
  public static void main(String [] args){

     int n = 10;
       int m = 10;
       for(int i = 0 ; i < n ; i++){
        for(int j = i+1; j < m ; j++){
            System.out.print("*");
        }
        System.out.println(" ");
       }
  }
}