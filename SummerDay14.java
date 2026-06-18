public class SummerDay14 {
    // recursion part-4
    public static int  calculatp(int x,int n){
     if(n==0){
        return 1;}
        if(x==0){
          return 0;
        }
     
        int xpower1=calculatp(x,n-1);
        int xpown=x*xpower1;
        return xpown;
    }
    public static void main(String[]arg){
        int x=2;
        int n=5;
      int ans =  calculatp(x,n);
      System.out.println(ans);
    }
    
}
