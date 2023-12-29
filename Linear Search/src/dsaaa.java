public class dsaaa {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int sum=0,jod=0;
        for(int i =1;i<=5;i++)
        {
            sum= sum+i;
        }

        for(int i=0;i<4;i++)
        {
            jod=jod+arr[i];
        }

        int miss=0;
        miss = sum- jod;

        System.out.println(miss);
    }
}
