package PTA12_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayIntegerStack A=new ArrayIntegerStack(n);
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            System.out.println(A.push(sc.nextInt()));
        }
        System.out.println(A.peek()+","+A.empty()+","+A.size());
        System.out.println(A.toString());
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println(A.pop());
        }
        System.out.println(A.peek() + "," + A.empty() + "," + A.size());
        System.out.println(A.toString());
        sc.close();
    }
}
