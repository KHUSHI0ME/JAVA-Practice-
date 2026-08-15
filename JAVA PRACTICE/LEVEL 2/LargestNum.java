import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter a num3: ");
        int num3 = sc.nextInt();

        int largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);

        sc.close();
    }

    public static int findLargest(int num1, int num2, int num3) {
        if(num1 >= num2 && num1 >= num3) {
            return num1;
        } else if(num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
    }

    
}

}
