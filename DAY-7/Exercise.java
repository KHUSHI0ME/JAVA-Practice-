import java.util.*;

public class Exercise {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];

        // INPUT
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
// OUTPUT
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x) {
                System.out.println("Found at index: " + i);
            }
          
        }
        sc.close();
    }
    
}
