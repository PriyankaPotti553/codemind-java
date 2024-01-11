import java.util.*;
public class c{
    public static void main(String args[]){
        char s;
        Scanner sc=new Scanner(System.in);
        s=sc.next().charAt(0);
        if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
        {
           System.out.println("Vowel") ;
        }
        else{
            System.out.println("Consonant");
        }
    }
}