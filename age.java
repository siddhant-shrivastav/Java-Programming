import java.util.*;
public class age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>= 18){
            System.out.println("Adult : Vote, Drive");
        }
        else if(age>=13 && age<= 18){
            System.out.println("Teanager");
        }
        else{
            System.out.println("Not Adult : Not Vote, Not Drive");
        }
    }
}
