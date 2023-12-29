import java.util.Scanner;

public class pallin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={1,2,3,2,1};
        int i=0;
        int n = arr.length;
        boolean flag= true;
        while(i<=n/2)
        {
            if(arr[i]!=arr[n-1-i])
            {
                flag=false;
                break;
            }
            i++;
        }
        if(flag = true)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
