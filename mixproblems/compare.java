package mixproblems;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("false");
            return;
        }
        int i=0;
        int j =0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                System.out.println("not equal");
                return;
            }
            i++;
            j++;
           
        }
         
                System.out.println("equal");
            
    }
}
