import java.util.*;
public class Weights{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int x = p.nextInt();
        int y = p.nextInt();
        int z = p.nextInt();
        int k = (3*x-(y+z));
        System.out.printf("%d",k);
        
    }
}