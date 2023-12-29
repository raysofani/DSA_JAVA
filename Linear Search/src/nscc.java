import java.util.Arrays;
import java.util.Scanner;

public class nscc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = {1,2,3,4,5};

        int i=0;
        int n= arr.length;
        while( i<=n/2)
        {
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-1-i]= temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
