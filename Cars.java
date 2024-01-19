import java.util.*;
public class cars{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int b = p.nextInt();
        int e = p.nextInt();
        if(a>b){
            System.out.println("-1");
        }
        else{
            int c = 1;
            while(e+a >= b){
                c++;
                a = a+a;
                b = b+b;
            }
            System.out.println(c);
        }
    }
}