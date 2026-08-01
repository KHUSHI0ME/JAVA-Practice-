import java.util.*;

public class Multiplication {
   public static int multiplication(int a, int b){
        int multiply = a*b;
        return multiply;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = multiplication(num1, num2);
            System.out.println("The product of two numbers is: " + result);
        }
    }
}
    
