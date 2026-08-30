package mixproblems;

import java.util.Scanner;

public class oddevencount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int ocount=0;
         for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
            else{
                ocount++;
            }
         }
         System.out.println(count);
         System.out.println(ocount);
    }
}
