public class ButterflyPattern {
    public static void main(String[] args) {

        // Code for Butterfly Pattern
        int n =5;

        // UPPER HALF OF THE BUTTERFLY
        for(int i=1; i<=n; i++) {
            
            
         // 1st Half Of Butterfly
         // Stars
        for(int j = 1; j<= i; j++) {
        System.out.print("*");
        }

        // Spaces
        int spaces = 2*(n-i);

        for(int j = 1; j<=spaces; j++) {
        System.out.print(" ");
        }

        // 2nd Half Of Butterfly
        // Stars
        for(int j = 1; j<= i; j++) {
        System.out.print("*");
        }
        System.out.println();

        }
          
        // LOWER HALF OF THE BUTTERFLY
        for(int i=n; i>=1; i--) {
            
            
         // 1st Half Of Butterfly
         // Stars
        for(int j = 1; j<= i; j++) {
        System.out.print("*");
        }

        // Spaces
        int spaces = 2*(n-i);

        for(int j = 1; j<=spaces; j++) {
        System.out.print(" ");
        }

        // 2nd Half Of Butterfly
        // Stars
        for(int j = 1; j<= i; j++) {
        System.out.print("*");
        }
        System.out.println();

        }
    }

    }
    
