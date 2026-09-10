package SLIDING_WINDOW;

import java.util.Scanner;

class Maximum_Sum_Subarray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter k");
    int k =sc.nextInt();
    int sum=0;
    int max=0;
    for(int i=0;i<k;i++){
       sum= sum +arr[i];
       
    }
    max = sum;
   for(int i=k;i<n;i++){
     sum = sum +arr[i]- arr[i-k];
     max = Math.max(max, sum);
   }
   System.out.println(max);


}
    
}