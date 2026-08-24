package twopointer;

import java.util.Scanner;

public class validpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();
        StringBuilder ns =  new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ns.append(ch);
            }
            
        }
        int l=0;
        int r= ns.length()-1;
  boolean flag = false;
        while (l<r) {
  if(ns.charAt(l)!=ns.charAt(r)){
   System.out.println("false");
   return;
  }
 l++;
 r--;

            
        }
        System.out.println("true");
    }
}
