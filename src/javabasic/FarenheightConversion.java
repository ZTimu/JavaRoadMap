package javabasic;
import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class FarenheightConversion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gap,start, end;
        start= sc.nextInt();

        end=sc.nextInt();
        gap=sc.nextInt();
        for(int i=start;i<=end;i+=gap){
            int tempFarenheight=i;
            float celcius;
            celcius= (float) ((tempFarenheight-32.0)*(5.0/9.0));
            if(celcius<0) System.out.println(i+" "+(int)ceil(celcius));
            else System.out.println(i+" "+(int)floor(celcius));


        }
        sc.close();
    }
}
