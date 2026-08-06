
public class Characters {

     public static void main(String[] args) {
        String firstName = "Khushi";
        String lastName = "Khandelwal";

        // Concatenation using + operator
        String fullName1 = firstName + " " + lastName;
        System.out.println("fullName1: " + fullName1);

        // Length of a string
        int length = fullName1.length();
        System.out.println("Length of fullName1: " + length);

        // charAt
        for(int i = 0; i<fullName1.length(); i++){
        System.out.println(fullName1.charAt(i));
        }
    }
    
}

