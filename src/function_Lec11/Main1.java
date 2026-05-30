public class Main1{
    public static void main(String [] args){

        fun();
        System.out.println(sum(10.1,10.1));

    }
    
    static int sum(int a,int b){
        return (a+b);
    }
    
    static int sum(int a,int b,int c){
        return (a+b+c);
    }

    static int sum(double a,double b){
        return (int)(a+b);
    }

    static void fun(){
             System.out.println("hello");
        
    }

    static int fun1(){ // show error overloading differenciate on parameter not on functiontype 
           System.out.println("hello");
        return 10;
    }



}