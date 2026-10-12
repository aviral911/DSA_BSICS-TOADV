package mids;

import java.util.Scanner;


class kposition {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[]= new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   int a =0;
   for(int i=0;i<n;i++){
    a = a+arr[i];
   }
   System.out.println(a/n);
   sc.close();
}
    
}