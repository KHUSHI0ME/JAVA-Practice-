public class SolidRhombus {
    public static void main(String[] args){
    
    int n = 5;

    // OUTER LOOP
    for(int i=1; i<=n; i++){
    
    // SPACES 
    int spaces = (n-i);
    for(int j=1; j<=spaces; j++){
    System.out.print(" ");
    }

    // Stars
    for(int j=1; j<=5; j++){
    System.out.print("*");
    }
    System.out.println();
}
    }
}
