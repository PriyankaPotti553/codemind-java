import java.util.*;
public class Sphere{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        double k = (4*3.14*n*n*n)/3;
        System.out.printf("%.2f",k);
    }
}