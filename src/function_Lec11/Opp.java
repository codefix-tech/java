public class Opp{
    public static void main(String [] args){

        Students s1 = new Students();
        s1.name = "Nishant Kumar";
        s1.age = 20;
        s1.course="BTech";

        s1.markAttendance();
        s1.print();

    }
}

class Students{

    String name;
    int age;
    String course;

    void markAttendance(){
        System.out.println("Attendance MArked " + name);
    }
    void print(){
        System.out.println(name+age+course);
    }
}