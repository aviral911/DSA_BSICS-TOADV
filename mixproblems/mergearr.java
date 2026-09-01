package mixproblems;

import java.util.Scanner;

public class mergearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m= sc.nextInt();
        int ar[]= new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int j=0;int i=0;int k=0;
        int temp[] = new int[arr.length+ar.length];
        while (i <arr.length&&j<ar.length) {
            if(arr[i]<arr[j]){
                arr[k++]=arr[i++];
            }
            
            
        }
    }
}
