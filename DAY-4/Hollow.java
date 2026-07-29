public class Hollow {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // Outer loop
        for (int i = 1; i <= n; i++) {

            // Inner loop
            for (int j = 1; j <= m; j++) {

                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after one complete row
            System.out.println();
        }
    }
}

