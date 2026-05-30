public class Main2{
    public static void main(String [] args){
        a();
        
    }

    static void a(){
        b();
        System.out.println("bye");
        
    }


    static void b(){
        c();
        System.out.println("hi");
    }
    static void c(){
        
        System.out.println("hello");
    }

}