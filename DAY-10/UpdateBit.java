import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    // oper = 1 : set operation = 0 : clear operation

        int n = 5; // Example number
        int position = 1; 

        if(oper==1){
            int bitMask = 1 << position; 
            int newNumber = bitMask | n; // Set the bit at the specified position using bitwise OR
            System.out.println("Original number: " + n);
            System.out.println("New number after setting bit at position " + position + ": " + newNumber);
            
        } else if(oper==0){
            int bitMask = (1 << position); // Create a bitmask by left-shifting
            bitMask = ~bitMask; // Invert the bitmask
            int newNumber = n & bitMask; // Clear the bit at the specified position using bitwise AND
            System.out.println("Original number: " + n);
            System.out.println("New number after clearing bit at position " + position + ": " + newNumber);
        }
        sc.close();
    }
}