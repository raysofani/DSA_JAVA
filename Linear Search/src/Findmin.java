public class Findmin {
    public static void main(String[] args) {
        int[] arr = {};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
