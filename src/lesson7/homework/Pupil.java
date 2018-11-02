package lesson7.homework;

import java.util.Arrays;

public class Pupil {
    private int  id;
    String[] ex = new String[2];
    int[] marks = new int[2];
//    private ExamResult[] examResults;
    public Pupil(int id){
        this.id = id;
    }

    public void setExams(String ex0, String ex1, int marks0, int marks1){
        ex[0] = ex0;
        ex[1] = ex1;
        marks[0] = marks0;
        marks[1] = marks1;
    }

//    public void setExams(String[] ex, int[] marks){
//        for (int i = 0; i < ex.length; i++){
//            examResults[i] = new ExamResult(ex[i], marks[i]);
//        }
//    }

//    class ExamResult{
//        boolean passed;
//        int i = 0;
//        String report;
//        public void pass(){
//            if ((marks[i] == 2) || (marks[i] == 1)){
//                passed = false;
//            } else passed = true;
//        }
//        if (passed == false){
//            report = "Не сдал";
//        } else report = "Сдал";
//
//        String[] examRes = new String[3]{ex[1], marks[1], };
//
//    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id='" + id + '\'' +
                ", ex=" + Arrays.toString(ex) +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
