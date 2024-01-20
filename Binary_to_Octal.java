import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < Q; i++) {
            String binaryNumber = scanner.nextLine();
            int decimalNumber = Integer.parseInt(binaryNumber, 2);
            System.out.println(Integer.toOctalString(decimalNumber));
        }
    }
}
