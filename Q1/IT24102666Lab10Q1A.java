import java.util.Scanner;
public class IT24102666Lab10Q1A {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int mark;
        char grade = ' ';

        System.out.print("Enter the Mark (0 - 100): ");
        mark = input.nextInt();
        assert mark <= 100 && mark >= 0 : "Invalid Mark";

        if (mark <= 100 && mark >= 75) {
            grade = 'A';
        } else if (mark < 75 && mark >= 60) {
            grade = 'B';
        } else if (mark < 60 && mark >= 50) {
            grade = 'C';
        } else if (mark < 50 && mark >= 40) {
            grade = 'D';
        } else if (mark < 40 && mark >= 0) {
            grade = 'F';
        }

        System.out.print("Grade for the entered Mark is " + grade);

        if (mark <= 100 && mark >= 75) {
            assert grade == 'A' : "Incorrect Grade Assigned";
        } else if (mark < 75 && mark >= 60) {
            assert grade == 'B' : "Incorrect Grade Assigned";
        } else if (mark < 60 && mark >= 50) {
            assert grade == 'C' : "Incorrect Grade Assigned";
        } else if (mark < 50 && mark >= 40) {
            assert grade == 'D' : "Incorrect Grade Assigned";
        } else if (mark < 40 && mark >= 0) {
            assert grade == 'F' : "Incorrect Grade Assigned";
        }

        input.close();
        
    }
}