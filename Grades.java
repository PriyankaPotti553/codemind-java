import java.util.*;
public class Grades{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int p,c,b,m,t;
        p = s.nextInt();
        c = s.nextInt();
        b = s.nextInt();
        m = s.nextInt();
        t = s.nextInt();
        int a = (p+c+b+m+t)/5;
        if(a >= 90){
            System.out.println("Grade A");
        }
        else if(a >= 80){
            System.out.println("Grade B");
        }
        else if(a >= 70){
            System.out.println("Grade C");
        }
        else if(a >= 60){
            System.out.println("Grade D");
        }
        else if(a >= 40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    } 
}