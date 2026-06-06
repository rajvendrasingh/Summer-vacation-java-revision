import java.util.Scanner;
public class SummerDay4 {

    // find maximum and minimum value of  an array
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int size=sc.nextInt();
//         int [] num= new int [size];
//         for(int i =0;i<size; i++)
// {
//     num[i]=sc.nextInt();
// }
// int max= Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// for(int i=0; i<size;i++){
//     if(num[i]<min){
//         min=num[i];
//     }
//     if(num[i]>max){
//         max=num[i];
//     }
//     System.out.println("max num is"+max);
//     System.out.println("min value is "+min);
//     sc.close();

// }
//     }

  //  check ascanding order of an sorted array
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int []num=new int[size];
    for(int i = 0 ; i < size ; i++){
        num[i]=sc.nextInt();
    }
       boolean isAscending = true;
    for(int i = 0 ; i < size - 1 ; i++){
        if (num[i] > num[i+1]){
            isAscending = false;
            break;
        }
    }
    System.out.println(isAscending ? "Array is ascending" : "Array is not ascending");
    sc.close();
  }
    
}
