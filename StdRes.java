import java.util.*;
public class StdRes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();
        String Result = ((Marks>=33) ? "Pass":"Fail");
        System.out.println(Result);
    }
}
