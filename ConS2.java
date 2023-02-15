// Display all numbers enterd by user except multiple of 10...
import java.util.*;
public class ConS2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Number : ");
            
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        }
        while(true);
    }
}
