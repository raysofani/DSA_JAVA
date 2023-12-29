import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            int L=in.nextInt();
            int V1= in.nextInt();
            int V2= in.nextInt();
            float T1= L/V1;
            float T2= L/V2;
            int p= (int) Math.ceil(T1);

            int q=(int) Math.ceil(T2);

            if(p-q>=2)
            {
                System.out.println(p-q-2);
            }
            else{
                System.out.println(-1);
            }

        }
    }
}