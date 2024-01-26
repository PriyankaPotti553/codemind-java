import java.util.*;
public class Arthematic{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Quotient:"+(a/b));
        System.out.println("Remainder:"+(a%b));
    }
}