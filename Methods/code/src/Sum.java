import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2(20,30);
        System.out.println(ans);
    }
    static int sum2(int a, int b)
    {
        int sum = a + b;
        return sum;

    }
    static void sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = input.nextInt();
        System.out.print("Enter number 2:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("sum = "+ sum);


    }
}
