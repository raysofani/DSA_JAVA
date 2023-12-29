import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(10);
        list.add(67);
        list.add(654);
        list.add(454);
        list.add(67);
        list.add(67);
        list.add(654);
        list.add(454);
        list.add(654);
        list.add(454);
        list.add(67);
        list.add(654);
        list.add(454);
        list.add(67);
        list.add(654);
        list.add(454);
        System.out.println(list.get(in.nextInt()));

        System.out.println(list);
        System.out.println(list.contains(654));

    }
}
