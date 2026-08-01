//taking string and int values; 
import java.util.Scanner;

public class takingSTRING {
    public static void main(String[] args) {
        System.out.println("hy buddy");
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println(" enter your name ");
        String name = sc.nextLine(); // dont use nextLine after any data type(int , float ,....)

System.out.println("your age is : " + age + " "+" & "+  "your name is : "+name ) ;
sc.close();
    }
    
}
