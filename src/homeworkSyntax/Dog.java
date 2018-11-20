package homeworkSyntax;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String colour;
    private final int AVERAGE_WEIGHT = 15;
    private String address;
    private static int dogCount;
//    boolean sex;


    public Dog(String name) {
//        this(name,-1,-1,null, null);
//        return;
        this.name = name;
        dogCount++;
    }

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        dogCount++;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = AVERAGE_WEIGHT;
        dogCount++;
    }

    public Dog(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
        dogCount++;
    }

    public Dog(int weight, String colour, String address) {
        this.weight = weight;
        this.colour = colour;
        this.address = address;
        dogCount++;
    }

    public Dog(String name, int age, int weight, String colour, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.address = address;
        dogCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        dogCount--;
    }

    public static int getDogCount() {
        return dogCount;
    }


}
