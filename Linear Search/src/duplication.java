public class duplication {
    public static void main(String[] args) {
        int[] arr = {2,2,4,5,5};
        int c=0;
        int j=0;

        for(int i=0;i<5;i++)
        {
            while(j<5)
            {
                if(arr[j]==arr[i])
                {
                    c++;
                }
                j++;

            }
            if(c>1)
            {
                System.out.println(arr[i]+ " " + c);
            }
            c=0;
            j=i;
        }

    }
}
