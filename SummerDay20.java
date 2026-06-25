public class SummerDay20 {
    // move akk given elment to the end of the string
    //axbcxxd
    // public static void moveAllX(String str,int idx, int count, String newstring){
    //    if(idx==str.length()){
    //     for(int i=0; i<count;i++){
    //         newstring+='x';
    //     }
    //    System.out.println(newstring);
    //    return;
    //    }
    //     char currchar=str.charAt(idx);
    //     if(currchar=='x'){
    //         count++;
    //         moveAllX(str, idx+1, count, newstring);
    //     }
    //     else{
    //         newstring +=currchar;
    //         moveAllX(str, idx+1, count, newstring);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="axbcxxd";
    //     moveAllX(str, 0, 0, "");
    // }


    // remove all duplicate element
    //abbccda
    // public static boolean []map=new boolean[26];
    // public static void remove(String str, int idx, String newstr ){
    //   if(idx==str.length()){
    //     System.out.println(newstr);
    //     return;
    //   }
    //     char currchar= str.charAt(idx);
    //     if(map[currchar-'a']==true){
    //         remove(str, idx+1, newstr);

    //     }
    //     else{
    //         newstr +=currchar;
    //         map[currchar-'a']=true;
    //         remove(str, idx+1, newstr);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="abbccda";
    //     remove(str, 0, "");
    // }
    
    
}
