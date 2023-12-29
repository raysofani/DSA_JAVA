package src;

import java.util.Scanner;

public class rachit3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        if(n1>n2){
            if (n2>n3){
                System.out.println("the no is"+n2);
            } else if (n3>n1) {
                System.out.println("the ni is"+n1);
            }
              else{
                System.out.println("the no is"+n3);
            }
        }
        else{


    }
}
