import java.util.*;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);
        System.out.println("The sum is: " + sum);
       
        sc.close();
        
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
