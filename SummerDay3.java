import java.util.Scanner;
public class SummerDay3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = sc.nextInt();

        int[] marks = new int[size];
        // marks[0] = 97;
        // marks[1] = 98;5
        // marks[2] = 99;
        for (int i =0 ; i<size; i++){
            marks[i]= sc.nextInt();
        }
        for(int i = 0; i < size; i++){
            if (marks[i]==x){
                System.out.println("found at index"+i);
            }
            else{
                System.out.println("not found");
            }
        }
        sc.close();
    }
}
