// Print 1 to n numbers....

import java.util.*;

public class While3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.print(counter+ " ");
            counter++;

        }
        System.out.println();
        System.out.println("Numbers are printed...");
    }    
}
