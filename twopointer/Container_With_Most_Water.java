package twopointer;

import java.util.Scanner;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int right= arr.length-1;
        int left =0;
        int max=0;
        while(left<right){
        // area finding
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = height*width;
        //agar max < area
        if (area>max) {
            max = area;
        }
        // left < right
        if(arr[left]<arr[right]){
            left++;
        }
        else{
            right--;
        }
    }
    System.out.println(max);
    sc.close();
    }
}
