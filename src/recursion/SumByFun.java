public class SumByFun{
    public static void main(String [] arg){
     
         int n = 3; 
     System.out.print(fun(n));

    }
       

    static int fun(int n){

        if(n==0){
            return 0;
           
        }
         return n + fun(n-1);
    } 
}