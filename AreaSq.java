// Question 2: In a program, input the side of a square. You have to output the area of the square

import java.util.*;
public class AreaSq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area = n * n;
        System.out.println(area);
    }
}
