import java.util.Scanner;

public class DAys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int days = input.nextInt();

        switch (days) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> {
            }
        }

    }
}
