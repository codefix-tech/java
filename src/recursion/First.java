public class First{
    public static void main(String [] arg){
      
      System.out.print("function calling");
      fun();
       

    }
   static void fun(){
        System.out.print(1);
        
        fun();
       
    }
}