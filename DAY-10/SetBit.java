public class SetBit {
    public static void main(String[] args) {
        int n =5;

        int position = 1; // Position to set the bit (0-indexed)

        int bitMask = 1 << position; 

       int newNumber = bitMask | n; // Set the bit at the specified position using bitwise OR

        System.out.println("Original number: " + n);
        System.out.println("New number after setting bit at position " + position + ": " + newNumber);
    }
}
