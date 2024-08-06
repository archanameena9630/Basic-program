// package  onammamasigment;
import java.util.Scanner;
 class DMartShoppingApp {
    public static void main(String[] args){
        int total_bill=0;
        Scanner sc=new Scanner(System.in);     
         System.out.println("Enter the total purchase amount: ");
         int purchaseAmount=sc.nextInt(); 
        if(purchaseAmount>= 3000 && purchaseAmount < 5000) {
            int diss=purchaseAmount-500;
            System.out.println ("discount 500 rupe :"+diss);
        }
         else if (purchaseAmount >= 5000 && purchaseAmount < 10000) {
            int dis=purchaseAmount*30/100;
             total_bill=purchaseAmount-dis;
            System.out.println("You get a 30% discount of ₹:"+total_bill);                                 
        }
         else if (purchaseAmount>=10000 && purchaseAmount <15000) { 
            System.out.println(" congrates You get a free gift: Mixer:"+purchaseAmount);
        }
         else if (purchaseAmount >= 15000) { 
            total_bill=purchaseAmount;                 
            System.out.println("congrates free gift: Suitcase:" +purchaseAmount);
        }
        else{                                                                                                                                                                                                      
            System.out.println("No discounts or free gifts are applicable.");
            System.out.println("your final  total amount is:₹:"+purchaseAmount );
    }                                                         
         sc.close();
}
 }
