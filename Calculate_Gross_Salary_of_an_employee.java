import java.util.*;
public class GrossSalary{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        double pf = (a*12)/100;
        double g = a+b+c+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f
",g);
    }
}