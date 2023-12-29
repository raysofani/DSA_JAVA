import java.util.Arrays;
import java.util.Scanner;

public class colnotknown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},{3,6},{7,8,9,4}
        };

        for(int row=0; row<arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
