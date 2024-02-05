import java.util.*;
public class Good{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(x >= 2*y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}