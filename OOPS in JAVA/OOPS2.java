class Pen{  // class is a blueprint of an object
    String color;
    String type; // ballpoint; gel
    
    public void write(){  // method is a function that belongs to a class
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color); // this keyword is used to refer to the current object
    }
}

class Student {
    String name;
    int age;
    int rollno;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }
}

public class OOPS2{
    public static void main(String[] args) {
        Student s1 = new Student(); // student1 is an object of class Student
        s1.name = "John";
        s1.age = 20;
        s1.rollno = 101;
        s1.printInfo();
    }
}

// new keyword is used to create an object of a class. It allocates memory for the object and returns a reference to that memory.
// Student(); = This is a constructor. It is a special method that is called when an object is created. It has the same name as the class and does not have a return type.