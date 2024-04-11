import java.util.Scanner;
<<<<<<< HEAD

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
=======
public class Prompter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum:");
        int min = scanner.nextInt();
        System.out.println("Enter maximum:");
        int max = scanner.nextInt();
        do {
            System.out.println("Enter number between " + min + " and " + max + ":");
            int userInput = scanner.nextInt();
            if (userInput < min) {
                if (userInput > max){
                    System.out.println("Enter a number within range.");
                }
            }
        }
        System.out.println("You entered: " + userInput);
        scanner.close();
>>>>>>> 87085d56e7ad0832c9370024abc967799555ecec
    }
}
