public class Print1tom{

    public static void main(String [] arg){

       int n = 8;
   fun(1,n);


    }


    static void fun(int i , int n){
        if(i == n)
        return;

       System.out.print(i);
       i++;
       fun(i,9);


    }
}