package mixproblems;

import java.util.Scanner;

public class seclargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int max=0;
        int secmax=1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        for(int i=0;i<n;i++){
            if(arr[i]>secmax &&arr[i]<max){
                secmax=arr[i];
            }
        }
System.out.println(secmax);
        }
}
