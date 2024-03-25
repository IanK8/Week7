import java.util.Scanner;
public class NumbersSum {
    public static void main(String[] args) {
        int userNum = 1;
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = input.nextInt();

        while (userNum <= num){
            System.out.println(userNum);
            sum += userNum;
            userNum++;
        }
        System.out.println("sUM: " + sum);
    }
}
