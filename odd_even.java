package precticprogram;
import java.util.Scanner;
class oddeven{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    
    
            for(int i=1;i<=100;i++){
                if(i%2==1){
                    System.out.println(i);
                }
            }
        }
}