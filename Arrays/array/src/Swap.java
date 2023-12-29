import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,3,4,5,6};
        swap(arr,1,3);

    }
    static void swap(int[] arr, int index1, int index2)
    {
        arr[index1]=arr[index1]+arr[index2];
        arr[index2]=arr[index1]-arr[index2];
        arr[index1]=arr[index1]-arr[index2];
        System.out.println(Arrays.toString(arr));
    }
}
