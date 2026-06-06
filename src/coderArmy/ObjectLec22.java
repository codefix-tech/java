public class ObjectLec22{
    public static void main(String [] args){

      Student s1 = new Student();
      s1.name = "Nishant kumar";
      s1.age = 20;
      System.out.println(s1);  // we use method of object class
      // its already present in parent class that all class extend 
      // by default . 
      // inside println use toString . without 
      // typing s1.toString its printed that method

    }
}

class Student{

    String name;
    int age;

    public String toString(){
        return (name + " " + age );
    }
}