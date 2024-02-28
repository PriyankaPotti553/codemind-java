import java.util.*;
public class PerfectSquare{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i < n;i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0;i < n;i++){
            int p = (int)Math.sqrt(arr[i]);
            int q = p*p;
            if(arr[i] == q){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}