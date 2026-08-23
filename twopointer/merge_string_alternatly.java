package twopointer;

import java.util.Scanner;

public class merge_string_alternatly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
 String s2 = sc.nextLine();
 String result="";
 int i=0;
 int j=0;
 while (i<s1.length()&&j<s2.length()) {
    result = result + s1.charAt(i);
     result = result +s2.charAt(j); 
     i++;
     j++;   
 }
 while (i<s1.length()) {
    result=result+s1.charAt(i);
    i++;
 }
  while (j<s2.length()) {
    result=result+s2.charAt(j);
    j++;
 }
 System.out.print(result);
    }
}
