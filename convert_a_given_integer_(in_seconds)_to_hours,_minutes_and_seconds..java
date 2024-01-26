import java.util.*;
public class Seconds{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int a = p.nextInt();
        int H = a/3600;
        int M = (a%3600)/60;
        int S = ((a%3600)%60);
        System.out.println("H:M:S-"+H+':'+M+':'+S);
    }
}