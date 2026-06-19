public class SummerDay15 {
// print x^n(stac hight =logn)
public static int  calcpower(int x ,int n ){
    if(n==0){
        return 1;}
        if(x==0){
            return 0;
        }
        // if n is even
        if(n%2==0){
         return calcpower(x, n/2)*calcpower(x, n/2);
        }
        else{// if n is odd
            return calcpower(x, n/2)*calcpower(x, n/2)*x;
        }
    

   
}
public static void main(String[] args) {
    int n=5;
    int x=2;
    int result = calcpower(x,n);
    System.out.println(result);
}

    
}