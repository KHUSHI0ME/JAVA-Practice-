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

class student {
    String name;
    int age;
    int rollno;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }
}

public class OOPS{
    public static void main(String[] args) {
        Pen pen1 = new Pen(); // pen1 is an object of class Pen

        pen1.color  = "blue";
        pen1.type = "gel";
        pen1.write();
        
        Pen pen2 = new Pen(); // pen2 is another object of class Pen
        pen2.color = "black";
        pen2.type = "ballpoint";
        
        pen1.printColor();
        pen2.printColor();
    }
}