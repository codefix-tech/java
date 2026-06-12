public class SumByParameter{
    public static void main(String [] arg){

    
          fun(3,0);

    }

    static void fun(int i , int sum){

        if(i<1)
        {
            System.out.print(sum);

            return;

        }

        fun(i-1,sum + i);

    }
}