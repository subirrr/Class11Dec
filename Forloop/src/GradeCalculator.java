import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double totalMarks = 0.0;
        int totalSubjects = 0;

        System.out.println("Enter marks for each subject (or 'n' to stop):");

        String[] subjects = {"Math", "Chemistry", "Physics", "Nepali", "English", "Computer"};

        for (String subject : subjects) {
            System.out.print("Enter marks for " + subject + ": ");
            String userInput = inputScanner.next();

            if (userInput.equals("n")) {
                break;
            }

            int subjectMarks = Integer.parseInt(userInput);


            if (subjectMarks >= 0 && subjectMarks <= 100) {
                totalMarks += (subjectMarks >= 90) ? 4.0 : (subjectMarks >= 80) ? 3.0 : (subjectMarks >= 70) ? 2.0 : (subjectMarks >= 60) ? 1.0 : 0.0;
                totalSubjects++;
            } else {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
            }
        }

        if (totalSubjects > 0) {
            double overallGPA = totalMarks / totalSubjects;
            System.out.println("Overall GPA: " + overallGPA);
        } else {
            System.out.println("No valid grades entered.");
        }
    }
}
