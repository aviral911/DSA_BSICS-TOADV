package weeklyassesment9;

import java.util.Scanner;

public class sorrrted {
    static boolean sorti(int[]arr,int i){
        if(i>=arr.length-1)return true;
        if(arr[i]>arr[i+1])return  false;
        return  sorti(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(sorti(arr,0));

    }
    
}
