import java.util.*;
public class Reach{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int x = p.nextInt();
        int y = p.nextInt();
        int max_Dis = x*5;
        if(max_Dis >= y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}