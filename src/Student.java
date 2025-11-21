public class Student {
    private String name;
    private int score;
    private char grade;
    private String remarks;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        this.grade = computeGrade(score);
        this.remarks = computeRemarks(this.grade);
    }

    private char computeGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    private String computeRemarks(char grade) {
        return grade == 'F' ? "Fail" : "Pass";
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public char getGrade() { return grade; }
    public String getRemarks() { return remarks; }
}
