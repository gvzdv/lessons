package lesson7.homework;

public class Main {
    public static void main(String[] args) {

        Pupil pupil = new Pupil(12);
        pupil.setExams("Biology", "Maths", 2, 5);
        System.out.println(pupil.toString());
    }
}
