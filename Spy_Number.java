import java.util.*;
public class SpyNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int product = 1;
        while(n>0){
            int d = n%10;
            sum+=d;
            product *= d;
            n = n/10;
        }
        if(sum == product){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
        
    }
}