import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//    String message = greet();
//        System.out.println(message);
        System.out.print("Enter your name:");
        String name = input.nextLine();
    String personalised = myGreet(name);
        System.out.println(personalised);
    }

     static String myGreet(String name) {
        String message = "hello " +name;
        return message;

    }


    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
