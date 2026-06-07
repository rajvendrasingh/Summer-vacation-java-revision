import java.util.Scanner;

class SummerDay5 {
    public static void main(String []args){
    //     Scanner sc = new Scanner(System.in);
    //     int rows = sc.nextInt();
    //     int cols = sc.nextInt();
    //     // int x = sc.nextInt();
    //     int [][] num = new int [rows][cols];
    //      for(int i = 0 ; i<rows ;i++){
    //         for(int j = 0; j<cols ; j++){
    //             num [i][j]=sc.nextInt();
    //         }
    //     }
    //     int x =sc.nextInt();
    //     for (int i = 0 ; i < rows ; i++){
    //         for (int j = 0 ; j < cols ; j++){
    //            if (num [i][j]==x){
    //             System.out.println("num founded at index"+" " + i + " ," + j + " ");
    //            }
    
    //     }
    //     System.out.println();
    
    // }}


    /// spiral matrix
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();
//     int m = sc.nextInt();
//     int matrix[][] = new int [n][m];
//     for ( int i = 0 ; i < n ; i++){
//         for ( int j = 0 ; j < m ; j++ ){
//             matrix[i][j]=sc.nextInt();
//         }
//     }
//     System.out.println("the spiral magrix is :");
//     int rowStart =0;
//     int rowEnd =  n-1;
//     int columnStart = 0;
//     int columnEnd =m-1;
//     while (rowStart<=rowEnd && columnStart<=columnEnd){
//     for (int column = columnStart ; column <= columnEnd ; column ++){
//         System.out.print(matrix[rowStart][column]+" ");
        
//     }rowStart++;
//         for(int row = rowStart ; row <= rowEnd ; row ++){
//             System.out.print(matrix[row][columnEnd]+" ");
            
//         }columnEnd--;
//         for ( int column = columnEnd ; column >= columnStart ; column--){
//             System.out.print(matrix[rowEnd][column]+" ");
            
//         }rowEnd--;
//         for ( int row = rowStart ; row <= rowEnd ; row++){
//             System.out.print(matrix[row][columnStart]+" ");
            
//         }columnStart++;
//     }
//         System.out.println();   
// sc.close();

//         }

// inverse matrix
  Scanner sc = new Scanner (System.in);
  int n =sc.nextInt();
  int m = sc.nextInt();
 int[][]mat=new int [n][m];
 for (int i = 0 ; i < n ; i ++){
    for(int j = 0 ; j< m ; j ++){
        mat[i][j]=sc.nextInt();
    }
  
   
        }  System.out.println("matrix transpose is "+" ");
    
     for (int j = 0 ; j < m ; j ++){
        for (int i = 0 ; i < n ; i ++ ){
            System.out.print(mat[i][j]+" ");
     }System.out.println();
   } sc.close();
 }
}



    
