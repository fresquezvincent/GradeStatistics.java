import java.util.Scanner;
public class GradeStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double grade;
        double maxGrade = 0.0;
        double minGrade = 0.0;
        System.out.println("Please enter 10 grades:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Grade " + i + ": ");
            grade = input.nextDouble();
            total += grade;
            if (i == 1) {
                maxGrade = grade;
                minGrade = grade;
            } else {
                if (grade > maxGrade) {
                    maxGrade = grade;
                }
                if (grade < minGrade) {
                    minGrade = grade;
                }
            }
        }
        double average = total / 10;
        System.out.println("\nGrade Statistics:");
        System.out.println("Average: " + average);
        System.out.println("Maximum Grade: " + maxGrade);
        System.out.println("Minimum Grade: " + minGrade);
        input.close();
    }
}
