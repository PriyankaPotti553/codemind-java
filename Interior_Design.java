import java.util.*;
public class InteriorDesign{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int a = (x1+y1);
        int b = (x2+y2);
        if(a<=b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        
    }
}