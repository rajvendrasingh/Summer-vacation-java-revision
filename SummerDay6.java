import java.util.Scanner ;
public class SummerDay6 {
    public static void main (String []args){
  // Scanner sc = new Scanner (System.in);
  // String name = sc.nextLine();
  //  System.out.println("your name is "+name);
  //  sc.close();

  // concatenation in java
//   String fistName = "RAj";
//   String LastNAme = "Singh";
//   String FUllNAme = fistName+LastNAme;
//   System.out.println(FUllNAme.length());
//   for(int i = FUllNAme.length()-5 ; i <  FUllNAme.length(); i++){
//   System.out.println(FUllNAme.charAt(i));
// }System.out.println(FUllNAme.length());

// compare strings
// String Name1="raj";
// String Name2="raj";
// if (Name1==Name2){
// System.out.println("Name are matched");
// }
// else{
//   System.out.println("name are diff");
// }
 
// if(Name1.compareTo(Name2)==0){
// System.out.println("NAme are matched");
// }
// else{
//   System.out.println("NAme are miss matched");
//      }

// sub Strings in java 
// String Secntence = " my name is tony stark";
// String name = Secntence.substring(1,4);
// System.out.println(name);
// String str = "123";
// int num = Integer.parseInt(str);
// System.out.println(num);
// int num1 =231;
// String str2 = Integer.toString(num1);
// System.out.println(str2);
// System.out.println(str2.getClass().getName());

Scanner sc = new Scanner ( System.in);
// int size = Integer.parseInt(sc.nextLine());
// String [] name = new String [size];
//      int totalLength = 2;
// for ( int i = 0 ; i < size ; i ++){
//   name[i] =sc.nextLine();
//   totalLength += name[i].length();

// }
// System.out.println(totalLength);
// sc.close();

// String name = sc.nextLine();
// String result = "";
// for(int i = 0; i < name.length(); i ++){
//   if(name.charAt(i)=='e'){
//     result +='i';
//   }
//   else {
//     result+=name.charAt(i);
//   }
// }

// System.out.println(result);

// String email = sc.nextLine();
// String userName = "";
// for ( int i = 0; i< email.length() ; i ++){
//   if(email.charAt(i)=='@'){
//     break;
//   }
//   else {
//     userName+=email.charAt(i);
//   }
//    System.out.println(userName);
// }
        String a="abc";
        String result="";
        for( int i = 0;  i < a.length(); i++){
            if(a.charAt(i)==a.charAt(0)){
                result+='d';
            }
            else{
                result+=a.charAt(i);
            }
        }
        System.out.println(result);
   }
}
