public class SummerDay12 {
    // recursion
    // print sum of n natural numb
    public static void printsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
          return ;
        }
        sum += i;
       
         printsum(i + 1, n, sum);
          System.out.println(i);
    }
    public static void main(String []arg){
  
        System.out.println(); printsum(1,5,0);
        
    }


    
}
