 class SummerDay16 {
    //problem
    // tower of hanoi
    public static void towerofhanoi(int n, String src, String helper, String des){
        if(n==1){
            System.out.println("transfer disk"+n+"from"+" "+src+" "+"to"+" "+des);
            return ;
        }
     towerofhanoi(n-1,src, des,helper);
     System.out.println("transfer disk"+n+"from"+" "+src+" "+"to"+" "+des);
     towerofhanoi(n-1, helper, src, des);

    }
    public static void main(String[] args) {
        int n=5;
        towerofhanoi(n, "s", "h", "d");
    }
    

    
}
