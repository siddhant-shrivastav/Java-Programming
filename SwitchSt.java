// Make A Simple Calculater In Java..............

import java.util.*;
public class SwitchSt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Operator(+,-,*,/): ");
        char operation = sc.next().charAt(0);
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        switch(operation){
            case '+' : System.out.println(n1+n2);
                            break;
            case '-' : System.out.println(n1-n2);
                            break;
            case '*' : System.out.println(n1*n2);
                            break;
            case '/' : System.out.println(n1/n2);
                            break;
            default : System.out.println("I'm Simple Calculator. Please don't make me joke....");
        }
    }
}
