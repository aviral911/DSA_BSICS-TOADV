package search;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           System.out.println("target");
           int k = sc.nextInt();
           int low =0;
           int high = n-1;
          int mid = (high+low)/2;
          while(low< high){
            if(arr[mid] == k){
                System.out.println(mid);
                return ;
            }
            else if (arr[mid]<k) {
                low = mid+1;
                
            }
              else{
                high = mid-1;
              }
          }
    }
}
