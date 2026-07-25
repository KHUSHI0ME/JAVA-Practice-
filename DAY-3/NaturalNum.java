public class NaturalNum {
    public static void main(String[] args){
        
        int n = 4;
        int sum = 0;
        for(int i = 1; i<=n; i++)
        {
        sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
