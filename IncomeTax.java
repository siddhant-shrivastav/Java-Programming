// Make a Income Tax Calculator using Java Programming..

import java.util.*;
public class IncomeTax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;

        if(income<500000){
            System.out.println("Tax is Zero.");
        }else if(income> 500000 && income<1000000){
            tax = (int) (income * 0.2);
            System.out.println(tax);
        }else{
            tax = (int) (income* 0.3);
            System.out.println(tax);
        }
    }    
}
