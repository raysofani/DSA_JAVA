import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values to swap");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        swap(num1,num2);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }
}
