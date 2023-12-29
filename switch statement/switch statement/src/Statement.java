import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();

        switch (fruits) {
            case "mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A red sweet fruit");
            case "orange" -> System.out.println("round fruit");
            default -> {
            }
        }
    }
}
