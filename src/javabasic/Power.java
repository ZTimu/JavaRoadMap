package javabasic;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;

public class Power {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==0&&b!=0) System.out.println(0);
        else if(b==0) System.out.println(1);
        else System.out.println((int)pow(a,b));
        sc.close();
    }
}
