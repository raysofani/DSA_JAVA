public class Max {
    public static void main(String[] args) {
        int[] arr= {1,4,3,6,87,4,6};
        int max=0;
        for(int i=0; i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
