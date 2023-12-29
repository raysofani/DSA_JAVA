package src;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,7,7,5,54);
        multiple(2,4,5,"Aniket","Ray");
    }
static void multiple(int a, int b, int c, String ...v){
    System.out.println(Arrays.toString(v));

}

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
