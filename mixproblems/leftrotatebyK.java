package mixproblems;

import java.util.Scanner;

public class leftrotatebyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        int []temp= new int[n];
        // baad ke k
        //temp me index lena hai
        
        int index =0;
        for(int i=k;i<n;i++){
            temp[index]=arr[i];
            index++;
        }
        //ke ke pahle wale
        for(int i=0;i<k;i++){
            temp[index]=arr[i];
            index++;
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
