package mixproblems;

import java.util.Scanner;

public class Countwords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
     
           String[] word = s.split(" ");
           System.out.println(word.length);
           
    }
}
