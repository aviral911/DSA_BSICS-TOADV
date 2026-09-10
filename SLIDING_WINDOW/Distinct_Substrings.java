package SLIDING_WINDOW;

import java.util.Scanner;

public class Distinct_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int  count =0;
        int n = s.length();
        for(int i=0;i<n-3;i++){
            char ch1=s.charAt(i);
                        char ch2=s.charAt(i+1);
            char ch3=s.charAt(i+2);
           if(ch1 != ch2 && ch2!=ch3 && ch3 != ch1){
            count++;

           }
        }
        System.out.println(count);
        sc.close();
    }
}
