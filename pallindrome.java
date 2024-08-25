package precticprogram;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int n=num;
        int rem=0;
        int rev=0;
        while (n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(num==rev){
            System.out.println("number is palindrom");
        }
        else{
            System.out.println("number is not palindrom");
        }
    }
}
