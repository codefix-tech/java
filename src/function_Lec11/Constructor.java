public class Constructor{
    public static void main(String [] args){
        Students s1 = new Students();

        // s1.name("Nishant");
        // s1.age(20);
        // s1.course("Btech");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.course);

    }
}
class Students{

    String name;
    int age;
    String course;


    Students(){
        this("unknown");
        System.out.println("initial");

    }
    Students(String name){
        this(name,0);
        System.out.println("first constructor");

    }
    Students(String name , int age){
        this(name,0 ,"unknown");
        System.out.println("second constructor");
    }
    Students(String name , int age , String course){
        this.name=name;
        this.age=age;
        this.course=course;
        System.out.println("third constructor");
    }

    void markAttendance(){
        System.out.println("Attendance MArked " + name);
    }
    void print(){
        System.out.println(name+age+course);
    }
}