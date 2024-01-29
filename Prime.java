import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int i = 2;
        if(n%i==0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}