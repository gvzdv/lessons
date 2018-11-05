package lesson7.homework;

public class Main {
    public static void main(String[] args) {

        Pupil pupil = new Pupil(12);
        String ex[] = {"Математика","Биология"};
        int marks[] = { 2, 5 };
        pupil.setExams(ex, marks);
        System.out.println(pupil.toString());
    }
}
