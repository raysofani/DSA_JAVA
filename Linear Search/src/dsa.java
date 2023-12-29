import java.sql.SQLOutput;

public class dsa {
    public static void main(String[] args) {

        int[] arr ={1,2,3,5};

        int[] temp = new int[6];
        int n=5;
        for(int i=0; i<4; i++)
        {

                temp[arr[i]]=arr[i];
        }
        for(int i=1;i<6;i++)
        {
            if(temp[i]==0)
            {
                System.out.println(i);
            }
        }

    }
}
