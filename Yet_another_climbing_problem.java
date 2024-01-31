import java.util.*;
public class ClimbingProblem{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int p,q;
            p = a/b;
            q = a%b;
            System.out.println((p+q));
        }
    }
}