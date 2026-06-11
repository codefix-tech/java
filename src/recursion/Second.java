public class Second{
    public static void main(String [] arg){
       
       
        fun();
         
    
    }

    static int count = 0;

    static void fun(){
        
       
        if(count == 3)
         return;
         System.out.print(count);
          count++;
      fun();
     
    }

    
}