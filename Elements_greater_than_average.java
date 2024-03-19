import java.util.*;
public class GreaterAverage{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int count = 0;
        int a;
        int[] arr = new int[n];
        for(int i = 0;i <= n-1;i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0;i <= n-1;i++){
            sum += arr[i];
        }
        a = sum/n;
        for(int i = 0;i <= n-1;i++){
            if(arr[i] >= a){
                count++;
            }
        }
        System.out.println(count);
    }
}