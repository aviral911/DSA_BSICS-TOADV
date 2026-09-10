package SLIDING_WINDOW;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        int k = sc.nextInt();
        int n = s.length();
        int count =0;
        s= s.toLowerCase();
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch== 'e'|| ch =='i'|| ch=='o'||ch=='u'){
                count++;
            }

        }
        int max = count ;
        for(int i=k;i<n;i++){
            char bh=s.charAt(i-k);
            char an = s.charAt(i);
            if(bh =='a'||bh=='e'||bh=='i'||bh=='o'||bh=='u'){
                count--;
            }
             if(an =='a'||an=='e'||an=='i'||an=='o'||an=='u'){
                count++;
            }
           max= Math.max(count, max);
        }
        System.out.println(max);
       
    }
}