public class BackNTo1{

    public static void main(String [] arg){

 fun(1,5);



    }

    static void fun(int i , int n){
      if(i>n)
      return;

      fun(i+1,n);
      System.out.print(i);

    }
}