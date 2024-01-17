import java.util.Scanner;

public class TankFillTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeA = scanner.nextInt();
        int timeB = scanner.nextInt();
        int fillTime = calculateFillTime(timeA, timeB);
        System.out.println(fillTime/2);
        scanner.close();
    }

    
    public static int calculateFillTime(int timeA, int timeB) {
        double harmonicMean = 2.0 / ((1.0 / timeA) + (1.0 / timeB));
        int fillTime = (int) Math.ceil(harmonicMean);

        return fillTime;
        
    }
}