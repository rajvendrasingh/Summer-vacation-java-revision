

public class SummerDay7 {
    public static void  main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        //  System.out.println(sb.charAt(2));

        // set char at index 
    //    sb.setCharAt(0,'y');
    //    System.out.println(sb);

       // insert function in java
    //    sb.insert(2, 'n');
    //    sb.delete(2, 4);
    //    sb.append('t');
    //    System.out.println(sb); 
    //    for (int i = sb.length()-1 ; i>=0;  i--){
    //     // System.out.println(i);
    //      System.out.print(sb.charAt(i));
    //  }
    //   sb.reverse();
    //   System.out.print(sb);
    for ( int i = 0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length()-1-i;//5-1-0 =  > 4

       char frontChar = sb.charAt(front);
       char backChar  = sb.charAt(back);
       
       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
        

    }
    System.out.println(sb);
      


    }
}
 