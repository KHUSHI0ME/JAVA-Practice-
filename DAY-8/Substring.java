public class Substring {
    public static void main(String[] args) {
        String name = "Khushi Khandelwal";

        // substring() method is used to extract a part of the string.
        // It takes two parameters: start index and end index (optional).
        // If end index is not provided, it extracts till the end of the string.

        String sub1 = name.substring(0, 6); // Extracts "Khushi"
        String sub2 = name.substring(7);    // Extracts "Khandelwal"

        System.out.println("Substring 1: " + sub1);
        System.out.println("Substring 2: " + sub2);
    }
    
}
