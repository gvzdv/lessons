package lesson7.homework;

import java.util.ArrayList;

public class ExamResult {
    int index;
    String id;
    String[] ex;
    int[] marks;
    public ArrayList examResult = new ArrayList();

    public ExamResult(int index, String id, String[] ex, int[] marks) {
        this.index = index;
        this.id = id;
        this.ex = ex;
        this.marks = marks;
    }
}
