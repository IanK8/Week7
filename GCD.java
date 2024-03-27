import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = input.nextInt();
        while (num2 > 0){
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("The GCD is " + num1);
    }
}
