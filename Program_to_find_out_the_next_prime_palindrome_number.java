import java.io.*;
import java.util.*;
import java.lang.Math;

public class NextPrimePalindrome {
    public static void main(String[] args) {
        int n, t, r = 0, c, d;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (true) {
            n++;
            t = n;
            
            // Reverse the number
            while (t > 0) {
                r = r * 10;
                r = r + t % 10;
                t = t / 10;
            }

            // Check if the reversed number is a palindrome
            if (r == n) {
                // Check if the palindrome is a prime number
                d = (int) Math.sqrt(n);
                for (c = 2; c <= d; c++) {
                    if (n % c == 0)
                        break;
                }

                if (c == d + 1)
                    break; // Exit the loop if it's a prime palindrome
            }

            r = 0; // Reset the reversed number for the next iteration
        }

        System.out.println(n); // Print the next prime palindrome number
    }
}
