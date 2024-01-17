import java.util.Scanner;

public class LastTwoCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        if (userInput.length() >= 2) {
            String lastTwoCharacters = userInput.substring(userInput.length() - 2);
            System.out.println(lastTwoCharacters);
        } 
        
    }
}