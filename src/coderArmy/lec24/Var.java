public class Var{
    public static void main(String [] arg){

        Random m = new Random();
        m.fun();

    }
}

interface MathConstant{
    double PI_VALUE = 3.14;
    int VALUE = 10;
}

class Random implements MathConstant{

    void fun(){
        System.out.println(PI_VALUE);
    }
}