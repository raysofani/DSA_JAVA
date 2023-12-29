import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[]= {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int[] arr)
    {
        int start=0;
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int arr[],int start,int end)
    {
        int temp= arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
