import java.util.Scanner;
class SummerDAy1 {

    // for add two num;
   /*public static int sum(int a, int b){
    return a+b;
   }
   public static void main(String[] args){
    System.out.println(sum(5, 10));
   }*/

    // for check even or odd num;

  /* * public static boolean number(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
        }
    
    public static void main(String[]args){
        System.out.println(number(5));
    }*/

        // max num;
   /* public static String max(int a, int b){
        if (a>b){
            return "a is larger";

        }
        else{
            return "b is larger";
        }
    }
    public static void main(String[]args){
        System.out.println(max(5,10));
    }*/
  /*  public static int CalculateSum(int a, int b){
    return a+b;
   }
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b = sc.nextInt();
    int sum=CalculateSum(a,b);
    System.out.println("sum of two num"+sum);
   }*/
 /* public static int multi(int a, int b){
    return a*b;
  }
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int a =sc.nextInt();
   int b =sc.nextInt();
   int Multi=multi(a,b);
    System.out.println("multi of two num"+Multi);
    
  }*/

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
        }
        public static void main(String[]args){
            Scanner sc = new Scanner (System.in);
            int n =sc.nextInt();
            System.out.println("factorial of num"+fact(n));
        } 
    }

