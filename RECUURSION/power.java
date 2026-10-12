// calling in function

 package RECUURSION;

class BASICS {
    // bc
    static  int POWEROFtwo(int n ){
        if(n==0){
            return 1;
            //R R
            }
            int ans = 2*POWEROFtwo(n-1);
            return ans;
        }
    
 public static void main(String[] args) {

 
 System.out.println(POWEROFtwo(5));
    
}}