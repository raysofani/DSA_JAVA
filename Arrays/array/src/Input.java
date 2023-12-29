import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0]= 23;
        arr[1]= 45;
        arr[2]= 233;
        arr[3]= 543;
        arr[4]= 3;

        System.out.println(arr[3]);
        // input using for loop
   String[] str = new String[4];
   for(int i =0; i<str.length;i++)
   {
       str[i]=in.next();
   }
        System.out.println(Arrays.toString(str));
   str[0] = "Aniket";
        System.out.println(Arrays.toString(str));


    }
}
