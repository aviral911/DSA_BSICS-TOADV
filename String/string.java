package String;

import java.util.Scanner;

/**
 * string
 */
public class string {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s= sc.nextLine();


    /* System.out.print(s);
    for(int i=0;i<s.length();i++){
        System.out.println(s.charAt(i)+" ");
    }
    System.out.println(s.length());
    System.out.println(s.charAt(13));
    int count =0;
   
    for(int i=0;i<s.length();i++){
        char ch = Character.toLowerCase(s.charAt(i));
        if(ch =='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u'){
            count++;
        }
    }
    System.out.println(count); */
    //reverse
   /*  String rev="";
    for(int i=s.length()-1;i>=0;i--){
       rev += s.charAt(i);
    }
    if(s.equals(rev)){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    } */
 /*  System.out.println(s.toLowerCase());
   String arr[]= s.trim().split(" ");
 
   System.out.println(arr.length);
   for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   } 
  for(int i=arr.length-1;i>=0;i--){
    System.out.print(arr[i]+" ");

  } */
 /* s.toLowerCase();
int vowel =0;
int consonent =0;
for(int i=0;i<s.length();i++){
     char ch = s.charAt(i);
    if(ch>='a'&&ch<='z'){
    if(ch =='a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u'){
        vowel++;
    }
    else{
        consonent++;
    }
     }}
     System.out.println(vowel);
     System.out.println(consonent); */
     /* String old=sc.next();
     String newword= sc.next();

     s.toLowerCase();
     String result =  s.replace(old,newword);
     System.out.println(result);
} *//* 
String str = "Hello World";

System.out.println(s.substring(0, 5)); */

/* 
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub = s.substring(start, end);

        System.out.println(sub); */

         /*  int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
          }           
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)] == 1) {
                System.out.println("First Unique Character: " + s.charAt(i));
                return;
            }
        }
        System.out.println("No Unique Character Found"); */
       /*  int frq []=new int[256];
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)]++;

        }
        for(int i=0;i<s.length();i++){
            if(frq[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("no char"); */
        int frq[]=new int[256];
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)]++;

        }
        for(int i=0;i<256;i++){
if(frq[i]>0){
    System.out.println((char)i+""+frq[i]);
}
        }
    }
}