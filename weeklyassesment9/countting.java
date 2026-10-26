package weeklyassesment9;

import java.util.Scanner;

public class countting {
    static int count(int n ){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("0");
        }
        else{
            System.out.println(count(Math.abs(n)));
        }
    }
}
