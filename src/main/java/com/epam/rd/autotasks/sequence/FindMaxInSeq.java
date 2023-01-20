package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scanner=new Scanner(System.in);
        int n=Integer.MIN_VALUE;
        while(true){
            int num=scanner.nextInt();
            if(num==0) break;
            if(num>n ) {
                n = num;

            }
        }
        //System.out.print(n);
        return n;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
