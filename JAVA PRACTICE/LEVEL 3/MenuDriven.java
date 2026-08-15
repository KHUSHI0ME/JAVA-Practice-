import java.util.*;

public class MenuDriven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Check Even/Odd");
            System.out.println("2. Check Positive/Negative");
            System.out.println("3. Check Square");
            System.out.println("4. Find Cube");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    checkEvenOdd(sc);
                    break;
                case 2:
                    checkPositiveNegative(sc);
                    break;
                case 3:
                    checkSquare(sc);
                    break;
                case 4:
                    findCube(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    static void checkEvenOdd(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
    
    static void checkPositiveNegative(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println(num + " is Positive");
        } else if(num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }
    }
    
    static void checkSquare(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square of " + num + " is " + (num * num));
    }
    
    static void findCube(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Cube of " + num + " is " + (num * num * num));
    }
}
