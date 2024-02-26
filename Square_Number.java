import java.util.Scanner;

public class SumOfSquares {
    static boolean isSumOfSquares(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            int remaining = n - i * i;
            int root = (int) Math.sqrt(remaining);
            if (root * root == remaining && root != i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = isSumOfSquares(n);
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
