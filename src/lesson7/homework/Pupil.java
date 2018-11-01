package lesson7.homework;

import java.util.Arrays;

public class Pupil {
    String  id;
    String[] ex = new String[2];
    int[] marks = new int[2];
    public Pupil(String id){
        this.id = id;
    }

    public void setExams(String[] ex, int[] marks){
        for (int i = 0; i)
        this.ex = Arrays.copyOf(ex, 2);
        this.marks = Arrays.copyOf(marks, 2);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id='" + id + '\'' +
                ", ex=" + Arrays.toString(ex) +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
