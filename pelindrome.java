//checking pelindrome number;
import java.util.Scanner;

public class pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;   // original number save kar liya

        int rev = 0;

        while (n > 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n /= 10;
        }

        if (rev == original) {
            System.out.println("It's a palindrome number");
        } else {
            System.out.println("It's not a palindrome number");
        }

        sc.close();
}
}
