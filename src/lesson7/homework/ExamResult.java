package lesson7.homework;

public class ExamResult{
    String ex;
    int marks;
    boolean passed;

    public ExamResult(String ex, int marks) {
        this.ex = ex;
        this.marks = marks;
        this.passed = marks > 2;
    }

    @Override
    public String toString() {
        if (passed) return ex + " сдал";
        else return ex + " не сдал";
    }
}
