// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr ={-18,-12,-4,0,2,3,4,15,16,18,22,45};
                int target = 22;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    // return the index
    // return -1 if it doesnot  exist
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle elemnt
            //int mid = (start+end)/2;
            // might be possibe that start + end thing that we are doing may exceed the range of integer so to avoid that
            // we can opt better approach
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if(target>arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
    }

