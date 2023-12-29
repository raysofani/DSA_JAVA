import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int num = input.nextInt();

        int d = 0;
        int rev = 0;
        while(num!=0)
        {
            d = num % 10;
            rev = rev*10 + d;
            num = num/10;

        }
        System.out.println("the reverse of the number is = "+rev);

    }
}
