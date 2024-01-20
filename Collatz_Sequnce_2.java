import java.util.Scanner;
public class Collatz { 
    public static void main(String args[]) { 
        Scanner sc=new Scanner(System.in); 
        int A=sc.nextInt(); int B=sc.nextInt(); 
        int maxChainLength=0; 
        int numberWithChainLength=0; 
        for(int i=A;i<=B;i++) { 
            int currentNumber=i; 
            int chainLength=0; 
            while(currentNumber!=1) { 
                if(currentNumber%2==0) { 
                    currentNumber=currentNumber/2; 
                    
                } 
                else { 
                    currentNumber=3*currentNumber+1; 
                    
                }
                chainLength++; 
                
            } 
            if(chainLength>maxChainLength) { 
                maxChainLength=chainLength; 
                numberWithChainLength=i; 
                
            } } 
            System.out.println(numberWithChainLength);
            }
            }