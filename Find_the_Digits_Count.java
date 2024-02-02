import java.util.*;
public class Count{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while(n>0)
        {
           int r= n%10;
            //r = n/10;
            count +=1;
            n/=10;
        }
        System.out.println(count);
    }
}