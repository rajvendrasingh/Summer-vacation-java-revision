//import java.util.HashSet;

public class SummerDay21 {
    // print all the subsequence of a string;
    //"abc";
    // public static void subsequence( String str, int idx, String newstr){
    //   if(idx==str.length()){
    //     System.out.println(newstr);
    //     return;
    //   }

    //     char curr=str.charAt(idx);

    //     // to be
    //     subsequence(str, idx+1, newstr+curr);

    //     //not to be
    //     subsequence(str, idx+1, newstr);
    // }
    // public static void main(String[] args) {
    //     String str="aaa";
    //     subsequence(str, 0, "");
    // }



    // print all the unique subsequences  of aa string 
    // public static void sub(String str, int idx, String newstr, HashSet<String> set){
    //     if(idx==str.length()){
    //         if(set.contains(newstr)){
    //             return;
    //         }
    //         else{
    //             System.out.println(newstr);
    //             set.add(newstr);
    //              return;
    //         }
    //     }
    //     char curr=str.charAt(idx);
    //     // to be
    //     sub(str, idx+1, newstr+curr, set);
    //     // not to be
    //     sub(str, idx+1, newstr, set);
    // }
    // public static void main(String[] args) {
    //     String str="aaa";
    //     HashSet<String> set=new HashSet<>();
    //     sub(str, 0, "", set);

    // }  

    // print keypad all comibination

//     public static String []keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

//     public static void printcb(String str, int idx, String combination){
//    if(idx==str.length()){
//     System.out.println(combination);
//     return;
//    }
//         char curr = str.charAt(idx);
//         String mapping = keypad[curr-'0'];

//         for(int i=0; i<mapping.length(); i++){
//           printcb(str,idx+1,combination+mapping.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str ="67";
//         printcb(str, 0, "");
  //  }
    
}
