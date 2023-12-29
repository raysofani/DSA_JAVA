import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1 -> System.out.println("Aniket Ray");
            case 2 -> System.out.println("Anjali Priya");
            case 3 -> System.out.println("Akash");
            case 4 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Mangement" -> System.out.println("Management department");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("Enter correct details");
        }
    }
}
