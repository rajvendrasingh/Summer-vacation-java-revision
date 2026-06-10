import java.util.Scanner ;
public class SummerDay8 {
    // binar numbers and operETORS
    // bit manipulation
    // get bit
    // set bit
    // update bit
    // clear bit
        public static void main(String[]args){
            // get bit
            Scanner sc = new Scanner(System.in);
       
            int n = 5;
            int pos =1;
            int bitmask= 1<<pos;
            // if ((bitmask & n)==0){
            //     System.out.println("bit was zero");

            // }
            // else{
            //     System.out.println("bit was one");
            // }
            // set bit
            // int newNumb = bitmask | n ;
            // System.out.println(newNumb);

            // clear bit 
            // int notbitmask = ~bitmask;
            // int newnum = notbitmask & n;
            // System.out.println(newnum);

            //update bit
            int opr = sc.nextInt();
            if (opr ==3)
            {
                int newnum = bitmask |n;
                System.out.println(newnum);
            }
            else{
                int notbitmask = ~bitmask;
                int newnum = notbitmask & n;
                System.out.println(newnum);
            }
            sc.close();
      
    }
    
}
