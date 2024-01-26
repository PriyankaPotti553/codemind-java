import java.util.*;
public class Fact{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while(t-->0){
            int a,b,z;
            a = p.nextInt();
            b = p.nextInt();
            z = Math.abs(a-b);
            if(z >= a || a == b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}