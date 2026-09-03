// BY INHERIATNCE REUSABILITY INCREASE

class Shape{  // parent class
    String color;
}

class Triangle extends Shape{ // child class 
    
}

public class Inheritance {
    public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "Red";
    System.out.println(t1.color);
}
}  
