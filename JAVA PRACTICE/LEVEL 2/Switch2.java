import java.util.*;

public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num = sc.nextInt();

        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        switch(operator) {

            case '+':
                System.out.println("Result: " + (num + num2));
                break;

            case '-':
                System.out.println("Result: " + (num - num2));
                break;

            case '*':
                System.out.println("Result: " + (num * num2));
                break;

            case '/':
                if(num2 != 0) {
                    System.out.println("Result: " + (num / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
                
            default:
                System.out.println("Invalid operator");

            sc.close();

            

        }
           
    }
}
        