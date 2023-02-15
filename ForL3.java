
import java.util.Scanner;
public class ForL3 {
    public static void main(String[] args) {
        int n = 34768;
        int last_d = 0;
        // while(n>0){
        //     last_d = n%10;
        //     System.out.print(last_d);
        //     n = n/10;
        // }
        for(int i =0;i<n;i++){
            last_d = n%10;
            System.out.print(last_d);
            n= n/10;
            i--;
        }
        System.out.println();
    }

       
}