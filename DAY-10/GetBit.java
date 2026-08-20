public class GetBit {
    public static void main(String[] args) {
        int n = 5; // Example number
        int position = 2; // Position to get the bit (0-indexed)

       int bitMask =1<<position; // Create a bitmask by left-shifting 1 to the desired position
       

        if ((bitMask & n) == 0) {
            System.out.println("The bit was zero.");
        } else {
            System.out.println("The bit was one.");
        }
}

}