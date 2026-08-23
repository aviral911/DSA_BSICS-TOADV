import java.util.Scanner;

public class rev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          
        }
        int l=0;
        int r =arr.length-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                System.out.println("mat kar bhai nhi hoga ");
                return;
            }
            l=l+1;
            r=r-1;
            

        }
        System.out.println("ha bhai hai palindrome array");
    }
}