import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.println("digit of occurence");
        int a = input.nextInt();
        int c = 0;
        int d=0;
        while(num!=0)
        {
            d = num%10;
            if( d==a)
            {
                c++;
            }
            num = num/10;
        }
        System.out.println("occurence is= "+c);
    }
}
