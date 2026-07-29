public class InvertedPyramid {
      public static void main(String[] args){
        int n = 4;

        //OUTER LOOP
        for(int i = n; i>=1; i--){

        //INNER LOOP
        for(int j = 1; j<=i; j++){
        System.out.print("*");
        }
        System.out.println();
        }

    }
}