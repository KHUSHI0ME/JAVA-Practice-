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

// NON PARAMETERIZED CONSTRUCTOR = there is no parameter in the constructor

//     Student(){ // constructor is a special method that is called when an object is created. It has the same name as the class and does not have a return type.
//         System.out.println("Constructor called");
//     }

// PARAMETERIZED CONSTRUCTOR = there is a parameter in the constructor
//     Student(String name, int age, int rollno){ // constructor is a special method that is called when an object is created. It has the same name as the class and does not have a return type.
//         this.name = name;
//         this.age = age;   // this keyword is used to refer to the current object
//         this.rollno = rollno;
//     }

    // COPY CONSTRUCTOR = it is used to copy the values of one object to another object. It has the same name as the class and does not have a return type.
    Student(Student s2){
       this.name = s2.name;
       this.age = s2.age;
       this.rollno = s2.rollno;
    }

    Student(){

    }
    }

public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student(); // student1 is an object of class Student
        s1.name = "John";
        s1.age = 20;
        s1.rollno = 101;

        Student s2 = new Student(s1); // student2 is an object of class Student
        s2.printInfo();
    }
}

