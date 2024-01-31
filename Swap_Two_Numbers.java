import java.util.*;
public class Swap{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int p = a+b;
        a = p - a;
        b = p - b;
        System.out.println(a);
        System.out.println(b);
    }
}