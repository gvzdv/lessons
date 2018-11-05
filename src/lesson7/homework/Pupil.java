package lesson7.homework;

import java.util.Arrays;

public class Pupil {
    int id;

    //    int exQuantity;
    public Pupil(int id) {
        this.id = id;
    }

    ExamResult[] examResults = new ExamResult[2];


    public void setExams(String ex[], int marks[]) {
        if (ex.length == marks.length) {
            for (int i = 0; i < ex.length; i++) {
                if ((marks[i] > 0) && (marks[i] < 6)) {
                    examResults[i] = new ExamResult(ex[i], marks[i]);
                } else System.out.println("Проставьте корректную оценку.");
            }
        } else System.out.println("Количество предметов не соответствует количеству оценок");


    }

    @Override
    public String toString() {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < examResults.length; i++){
            results.append("\n");
            results.append(examResults[i].toString());
        }
        return "Студент " + id + results;
    }
}
