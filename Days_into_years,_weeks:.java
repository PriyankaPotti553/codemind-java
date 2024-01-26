import java.util.*;
public class Days{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int d = p.nextInt();
        System.out.println(d/365);
        System.out.println((d%365)/7);
    }
}