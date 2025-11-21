import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            String name = sc.next();

            System.out.print("Enter score of " + name + ": ");
            int score = sc.nextInt();

            students[i] = new Student(name, score);
        }

        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (students[i].getScore() > students[maxIndex].getScore())
                maxIndex = i;

            if (students[i].getScore() < students[minIndex].getScore())
                minIndex = i;
        }

        System.out.println("\n===== STUDENT RESULTS =====");
        for (Student s : students) {
            System.out.println("\nName: " + s.getName());
            System.out.println("Score: " + s.getScore());
            System.out.println("Grade: " + s.getGrade());
            System.out.println("Remarks: " + s.getRemarks());
        }

        System.out.println("\nHighest Scorer: " + students[maxIndex].getName() +
                " (" + students[maxIndex].getScore() + ")");

        System.out.println("Lowest Scorer: " + students[minIndex].getName() +
                " (" + students[minIndex].getScore() + ")");
    }
}
