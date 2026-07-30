public class PalindromePattern {
    public static void main(String[] args){
    int n = 5;

    // Outer Loop
    for (int i = 1; i <= n; i++) {

     // Spaces
    for (int j = 1; j <= n - i; j++) {
    System.out.print(" ");
    }
     
    // 1st HALF NUMBERS

    for(int j=i; j>=1; j--){
    System.out.print(j);
    }

    // 2nd half Numbers

     // Stars
    for(int j=2; j<=i; j++){
    System.out.print(j);
    }
    System.out.println();
    }
    }
}
