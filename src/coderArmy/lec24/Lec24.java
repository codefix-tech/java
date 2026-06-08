public class Lec24{
    public static void main(String [] arg){
           
           Car c = new Thar();
           c.drive();

    }
}

interface Car{
    public void drive();
}

class Thar implements Car{
    
    @Override
    public void drive(){
          System.out.println("Thar is driving");
    }
}