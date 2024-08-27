package precticprogram;

import java.util.Scanner;

class swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        a=a-b;
        b=a+b;
        a=a-b;
        System.out.println("Swaping:"+a);
        System.out.println("Swaping:"+b);
    }
}