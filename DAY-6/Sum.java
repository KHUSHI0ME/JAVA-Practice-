import java.util.*;

// public static void Sum(int a, int b){
//     try(Scanner sc = new Scanner(System.in)) {
//     System.out.println("Enter two numbers");
//     int num1 = sc.nextInt();
//     int num2 = sc.nextInt();
//     int sum = num1 + num2;
//     System.out.println("The sum of two numbers is: " + sum);
//     }
// }

// public static void main(String[] args){
//     Sum(0, 0);
// }

public class Sum {
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = sum(num1, num2);
            System.out.println("The sum of two numbers is: " + result);
        }
    }
}
