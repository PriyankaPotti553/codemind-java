import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n%10;
        int p = (int)Math.log10(n);
        int b = n / (int)Math.pow(10,p);
        System.out.println((a+b));
        
    }
}