package mids;

import java.util.Scanner;

public class stribg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      /*   int vowel=0;
        int cons=0;
        for(int i=0;i<s.length();i++){
        
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
            if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e'){
vowel++;
            }else cons++;}
        }
        System.out.println(vowel);
        System.out.println(cons); */
        int left=0;
        int right=s.length()-1;
        while(left<right){
       if(s.charAt(left)!=s.charAt(right)){
        System.out.println("false");
        return;
       
    }
    left++;
    right--;
        }
        System.out.println("true");
        sc.close();
    }
}
