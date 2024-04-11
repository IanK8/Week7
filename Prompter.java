import java.util.Scanner;

public class Prompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum: ");
        int min = scanner.nextInt();
        System.out.print("Enter maximum: ");
        int max = scanner.nextInt();
        System.out.print("Enter number between " + min + " and " + max + ":");
        int userInput = scanner.nextInt();
        if (userInput < min){
            if (userInput > max){
                System.out.println("Enter a number within range.");
            }
        }
        System.out.println("You entered: " + userInput);
    }
}
