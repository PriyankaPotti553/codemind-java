import java.util.*;
public class NotDivisible{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0;i < n;i++){
            if(arr[i]%k != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}