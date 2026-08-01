import java.util.*;

public class Factorial {
    public static void printFactorial(int n){
        int factorial = 1;

        // LOOP TO CALCULATE FACTORIAL

        if(n < 0){
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }
        else if(n == 0 || n == 1){
            System.out.println("The factorial of " + n + " is: 1");
            return;
        }
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + n + " is: " + factorial);
        return;
    }
 
 public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a number");
        int num = sc.nextInt();
        printFactorial(num);
    }
 }
}