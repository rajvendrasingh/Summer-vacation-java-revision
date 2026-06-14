import java.util.Scanner;
public class SummerDay11 {
    // print num from input to 1
    // public static void printnum(int n){
    //    if ( n ==0){
    //     return;
    //    }
    //     System.out.println(n);
    //     printnum(n-1);
    // }
    // public static void main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     int n =sc.nextInt();
    //     printnum(n);
    //     sc.close();
    //}
   // print num 1 to 6  ;
   public static  void printnum(int n){
   
    if (n==6){
      
        return ;
    }
    System.out.println(n);
    printnum(n+1);
   }
public static void main(String[] args) {
     
   
    
    int n = 1 ;
    printnum(n);

    // print sum of n natural num
    
}

    
}
