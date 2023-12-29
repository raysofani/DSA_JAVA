public class Linear {
    public static void main(String[] args) {
        int[] nums ={2,4,5,6,7,44,55,23,454,654};
        int target = 65;
        int ans = Linearsearch(nums,target);
        System.out.println(ans);
    }

    static int Linearsearch(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if(element==target)
            {
                return index;
            }
        }
        return -1;
    }
}
