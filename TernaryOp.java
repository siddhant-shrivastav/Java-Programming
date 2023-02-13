// Even Or Odd Using Tearnary Operator...
import java.util.*;
public class TernaryOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = (((number%2)==0)? "Even" : "Odd");
        System.out.println(result);
    }
}
