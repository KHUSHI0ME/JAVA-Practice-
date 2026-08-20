public class ClearBit {
    public static void main(String[] args) {

        int n = 5; // Example number
        int position = 2; // Position to clear the bit (0-indexed)

        int bitMask = (1 << position); // Create a bitmask by left-shifting 1 to the desired position and then negating it
        int notbitMask = ~bitMask; // Negate the bitmask to clear the bit at the specified position

        int newNumber = notbitMask & n; // Clear the bit at the specified position using bitwise AND

        System.out.println("Original number: " + n);
        System.out.println("New number after clearing bit at position " + position + ": " + newNumber);
    }
}
