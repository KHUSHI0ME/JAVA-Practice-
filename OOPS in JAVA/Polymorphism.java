// COMPILE TIME POLYMORPHISM

class Pen {  // class is a blueprint of an object

    String color;
    String type; // ballpoint; gel

    public void write() {  // method is a function that belongs to a class
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color); // this refers to the current object
    }
}


class Student {

    String name;
    int age;

    // Method overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    // Method overloading
    public static void printInfo(int age) {
        System.out.println(age);
    }

    // Method overloading
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}


// Main class
public class Polymorphism {

    public static void main(String[] args) {

        Student s1 = new Student(); // s1 is an object of Student

        s1.name = "John";
        s1.age = 20;

        // Calls printInfo(String, int)
        s1.printInfo(s1.name, s1.age);
    }
}