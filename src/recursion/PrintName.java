public class PrintName{
    public static void main(String [] args){

         fun();
    }

    static int count = 0;

    static void fun(){
        if(count == 5)
         return;
        System.out.println("Nishant Kumar");
          count++;
        fun();
      
    }
}