
//Task 2 of CodSoft Java Developement Internship Student Grade Calculator.Vishal patil
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        calculateGrades();
    }

    private static void calculateGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        // Input: Take the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Input: Take marks obtained (out of 100) in each subject
        int[] subjectMarks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks in Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        // Calculate Total Marks: Sum up the marks obtained in all subjects
        int totalMarks = calculateTotalMarks(subjectMarks);

        // Calculate Average Percentage: Divide the total marks by the total number of
        // subjects
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);

        // Grade Calculation: Assign grades based on the average percentage achieved
        String grade = calculateGrade(averagePercentage);

        // Display Results: Show the total marks, average percentage, and the
        // corresponding grade to the user
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static int calculateTotalMarks(int[] subjectMarks) {
        int totalMarks = 0;

        for (int marks : subjectMarks) {
            totalMarks += marks;
        }

        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    private static String calculateGrade(double averagePercentage) {
        // Customize the grading scale as needed
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
