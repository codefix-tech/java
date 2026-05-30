public class Main{
    public static void main(String [] args){
         greet();
         sayHello("Nishant");
         int num = getNumber();
         System.out.println(num);
         System.out.println(multiply(2,4));
    }

    // NO input no output 

    static void greet(){
        System.out.println("Hello");
        return;
   }
  
   //Input , No Output

  static void sayHello(String name){
    System.out.println("Hello " + name);
   }
 // No Input , Output

 static int getNumber(){
    return 10;
 }

 // Input , Output
 static int multiply(int a,int b){
    return (a*b);
 }


}