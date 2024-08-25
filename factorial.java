package precticprogram;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num =sc.nextInt();
        int fact=1;
        // int sum=0;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            // sum=sum+fact;
        // }
            System.out.print(fact);
            // System.out.print(sum);
            
        }
    }
}
