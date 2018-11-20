package homeworkSyntax;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;
//    private int index;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    //    public int getIndex() {
//        return index;
//    }
    private boolean fight(Cat anotherCat) {

        return (this.strength + this.weight + this.age) > (anotherCat.strength + anotherCat.weight + anotherCat.age);

    }
}
