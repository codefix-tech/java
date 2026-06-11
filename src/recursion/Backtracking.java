public class Backtracking{
    public static void main(String [] arg){

      fun(3,3);
    }

    static void fun(int i , int n){
        if(i<1)
        return;
           
           fun(i-1,n);
        System.out.print(i);

    }
}