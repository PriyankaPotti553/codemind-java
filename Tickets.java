import java.util.*;
public class Tickets{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        if(p<=250){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}