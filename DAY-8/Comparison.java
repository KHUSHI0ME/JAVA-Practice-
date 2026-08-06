public class Comparison {
    public static void main(String[] args) {
    
        // COMPARE TWO STRINGS
        String name1 = "Parvesh";
        // String name2 = "Parvesh";
        String name2 = "Khushi";

        // THE compareTO() METHOD IS USED TO COMPARE TWO STRINGS LEXICOGRAPHICALLY.
        // IT CHECKS THREE CONDITION 

        //1 s1>s2 : returns positive value
        //2 s1<s2 : returns negative value
        //3 s1==s2 : returns 0

        if(name1.compareTo(name2) > 0){
            System.out.println("name1 is greater than name2");
        } else{
            
            System.out.println("name1 is less than name2");
        }
          
        
    }
    
}

