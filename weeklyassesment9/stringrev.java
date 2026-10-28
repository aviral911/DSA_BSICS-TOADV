package weeklyassesment9;

import java.util.Scanner;

import String.string;

public class stringrev {
    public static String rev(String s){
        // if(i<0){
        //     return;
        // }
        // System.out.print(s.charAt(i));
        // rev(s,i-1);
        if (s.length()<=0){
            return s;
        }
        return rev(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
     //   rev(s,s.length()-1);
        System.out.println(rev(s));
      //  sc.close();
    }
}
