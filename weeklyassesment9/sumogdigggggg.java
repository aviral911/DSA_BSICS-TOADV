package weeklyassesment9;

import java.util.Scanner;

public class sumogdigggggg {
    static int dig(int n){
        if(n==0){
            return 0;
        }
        return n%10+ dig(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dig(Math.abs(n)));
    }
}
