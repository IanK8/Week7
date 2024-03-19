import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        int grade;
        String letter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        grade = input.nextInt();
        if (grade >= 90){
            letter = "A";
        }
        else if (grade >= 80){
            letter = "B";
        }
        else if (grade >= 70){
            letter = "C";
        }
        else if (grade >= 60){
            letter = "D";
        }
        else{
            letter = "F";
        }
        System.out.println("You got a " + letter);
        if (letter == "A"){
            System.out.print("Great job");   
        }
        else if (letter == "B"){
            System.out.print("Good job");  
        }
        else if (letter == "C"){
            System.out.print("Reflect.");  
        }
        else if (letter == "D"){
            System.out.print("Hm");  
        }
        else if  (letter == "F"){
            System.out.print("No glasses of milk");  
        }
    }
}