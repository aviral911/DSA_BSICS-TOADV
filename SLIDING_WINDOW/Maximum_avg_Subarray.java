package SLIDING_WINDOW;

import java.util.Scanner;

public class Maximum_avg_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("k");
        int k= sc.nextInt();
        int sum =0;
        double max=0;
        double avg =0;
        for(int i=0;i<k;i++){
         sum = sum +arr[i];
          
        }
        avg = (double)sum/k;
        
        for(int i=k;i<n;i++){
           sum = sum +arr[i]-arr[i-k];
             double maxavg = (double)sum/k; 
             avg = Math.max(avg, maxavg);
           }
           System.out.println(avg);
    }
}
