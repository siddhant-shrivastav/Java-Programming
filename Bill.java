//Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.Scanner;
public class Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float gst = ((pen + pencil + eraser) *18)/100;
        float total = pen + pencil + eraser + gst;
        System.out.println(gst);
        System.out.println(total);  
    }
    
}
