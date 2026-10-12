package RECUURSION;

import java.util.Scanner;

public class oneTon {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i =0;

            fun(n,i);
            sc.close();
        }
        static void fun(int n ,int i){
          if(i>n) return;

            System.out.println(i+" ");
            fun(n,i+1);
            
        }
    }
