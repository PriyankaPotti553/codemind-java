import java.util.*;
public class Student{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();{
            for(int i = 1;i <= t;i++){
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int z = b-c;
                if(z>=a){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
            }
        }
    }
}