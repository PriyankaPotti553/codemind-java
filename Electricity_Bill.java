import java.util.*;
public class Electricity{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        String s1 = p.nextLine();
        String s2 = p.nextLine();
        int a = p.nextInt();
        double u,b,t;
        if(a < 199){
            u = 1.20;
        }
        else if(a > 200 && a < 400){
            u = 1.50;
        }
        else if(a > 400 && a < 600){
            u = 1.80;
        }
        else{
            u = 2.00;
        }
        b = u * a;
        if(b > 400){
            t = b + b*0.15;
        }
        else{
            t = b + 100;
        }
        System.out.printf("%.2f",t);
    }
}