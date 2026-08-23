package String;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     String name = "ram";
     System.out.println(name);
     char ar[]= name.toCharArray();
       System.out.println(Arrays.toString(ar));
       String s1 ="asdf";
       String s2= "asdf";
       if(s1==s2){
        System.out.println("equal");
       }
       else{
        System.out.println("no");
       }
       // why we are not use '==' in stirng;
       sc.close();
 }
    
}