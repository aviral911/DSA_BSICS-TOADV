package twopointer;

public class pelindrome {
    public static void main(String[] args) {
         String s = "level";
         int i=0;
         int j=s.length()-1;
         while (i<j) {
            if(s.charAt(i)!= s.charAt(j)){
                System.out.println("nhi hai bhai rahne do ");
              return;
            }
            i=i+1;
            j=j-1;
            
         }
         System.out.println("ha bhai ho gya palindrome");
    }
    
}
