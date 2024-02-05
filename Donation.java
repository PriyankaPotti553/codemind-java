import java.util.*;
public class Donation{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(y>x){
            System.out.println((y-x));
        }
    }
}