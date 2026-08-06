public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
       System.out.println(sb);

    // char at 0
    System.out.println(sb.charAt(0));

    // set char at index 0
    sb.setCharAt(0, 'P');
    System.out.println(sb);

    //insert char at index 3
    sb.insert(3, 'X');
    System.out.println(sb);

    //delete char at index 3
    sb.delete(2,3);
    System.out.println(sb);

    //append char 
    sb.append("r");
    sb.append("l");
    sb.append("d");
    System.out.println(sb);

    //length 
    System.out.println(sb.length());



    }
    
}
