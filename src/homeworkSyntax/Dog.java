package homeworkSyntax;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String colour;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
