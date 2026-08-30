package twopointer;

import java.util.Scanner;

public class reverse_from_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        //target
        int k=sc.nextInt();
        int[] temp = new int[n];
      //k ke baad wale
        int index = 0;
        for(int i=k;i<n;i++){
            temp[index]=arr[i];
            index++;


}// k ke pahle wale   
for(int i=0;i<k;i++){
    temp[index]=arr[i];
    index++;


}
// print
for(int i=0;i<n;i++){
    System.out.print(temp[i]+" ");
}

 }

}
