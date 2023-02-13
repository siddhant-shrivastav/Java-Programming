// Perform an operation using type casting in java.....


public class DataTy {
    public static void main(String[] args) {
        byte b = 4;
        char ch = 'a';
        short s = 45;
        int i = 46;
        float f = 12.9f;
        double d = 127.23873;
        int result = (int) (f*b) + (int) (i%ch) - (int) (d*s);
        System.out.println(result);
    }
}
