import java.util.*;
public class CountElements{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int c = 0;
        int[] arr = new int[n];
        for(int i = 0;i <= n-1;i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0;i <=n-1;i++){
            if(arr[i]%k == 0){
                c++;
            }
        }
        System.out.println(c);
    }
}