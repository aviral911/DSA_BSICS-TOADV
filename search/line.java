package search;

import java.util.Scanner;

public class line {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         int n = sc.nextInt();
          int arr[]= new int[n]; 
          for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();

           } 
           System.out.println("seaching elemnet"); 
           int k =sc.nextInt(); 
           for(int i=0;i<n;i++){ 
            if(k==arr[i]){
                 System.out.println(i); 
                 return ; 
                }
                 } 
                 System.out.println("-1");
             }
}
    
