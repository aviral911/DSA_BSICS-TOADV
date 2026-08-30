package twopointer;

import java.util.Scanner;

public class vowel_swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int l=0;
int r = ch.length-1;

        while(l<r){
            if("aeiouAEIOU".indexOf(ch[l])==-1){
          l++;
            }
            else if("aeiouAEIOU".indexOf(ch[r])==-1){
                r--;
            }
            else{
                char temp = ch[l];
                 ch[l]=ch[r];
                 ch[r]=temp;
                 l++;
                 r--;
            }

        }

        System.out.println(new String(ch));
    }
}
