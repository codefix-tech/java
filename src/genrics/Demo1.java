public class Demo1{
    public static void main(String [] arg){

        Pair< Integer , String> p1 = new Pair<>(20,"Nishant Kumar");
        System.out.print(p1.first + " " + p1.second);

    }
}
// generic class 
class Pair<T,U>{
    T first;
    U second;

    Pair(T first , U second){
        this.first = first;
        this.second = second;
    }


}