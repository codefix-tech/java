import java.util.*;
public class Demo{
    public static void main(String [] args){
          
          Collection<Integer> list = new TreeSet<>();
          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);
          list.add(50);

//iterator use to traverse in element . 
//we use any ds here access element
         Iterator<Integer> it = list.iterator();

         while(it.hasNext()){
            System.out.println(it.next());
         }

    }
}