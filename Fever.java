import java.util.*;
public class Fever{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x > 98){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}