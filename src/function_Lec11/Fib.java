public class Fib{
    public static void main(String [] args){
        int n = 5;
        System.out.println(fib());
    }

    static int fib(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }

        int x = fib(n-1);
        int y = fib(n-2);
        return (x+y);
    }
}