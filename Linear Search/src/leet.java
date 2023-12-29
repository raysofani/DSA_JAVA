import java.util.Arrays;

public class leet {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int temp = arr[0];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < arr.length - 1; i++) {

                temp = arr[i + 1];
                arr[i + 1] = arr[0];
                arr[0] = temp;


            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

