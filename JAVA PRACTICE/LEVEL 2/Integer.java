import java.util.*;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a num2: ");
        int num = sc.nextInt();

        System.out.print("Enter a num3: ");
        int num3 = sc.nextInt();

        System.out.print("Enter a num4: ");
        int num4 = sc.nextInt();

        System.out.print("Enter a num5: ");
        int num5 = sc.nextInt();

        int sum = num1 + num + num3 + num4 + num5;
        System.out.println("The sum of the numbers is: " + sum);
       
        sc.close();
    }
    
}
