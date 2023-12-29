import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        // print numbers from 1 to 5
//        for( int i = 1; i<=5 ; i++){
//            System.out.println(i);
//        }
        System.out.println("enter the number of series you want to print");
        int n = input.nextInt();
        System.out.println("the series is as follows");
        for( int i = 1; i<=n; i++)
        {
            System.out.println(" hello world" + i);
        }

    }
}
