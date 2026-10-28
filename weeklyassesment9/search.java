package weeklyassesment9;

import java.util.Scanner;

public class search {
    static int array(int[] arr,int i,int target){
                  if(i==arr.length) return -1;
                  if(arr[i]== target) return i;
                  return  array(arr,i+1,target );
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int target=sc.nextInt();
      System.out.println(array(arr,0,target));
     sc.close();

    }
    
}
