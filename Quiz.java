public class Quiz {
    public static void main(String[] args) {
    int a = 10;
    int b = 5;

    int product = a * b;
    System.out.println("The product of a and b is: " + product);

    int diff = a - b;
    System.out.println("The difference of a and b is: " + diff);
    
    int ans = (a*b)/(a-b);
    System.out.println("The answer of (a*b)/(a-b) is: " + ans);

    // int ans2 = a*b/a-b;
    // System.out.println("The answer of a*b/a-b is: " + ans);
    // OUTPUT WILL BE 0 OF THIS 
    }
    
}
