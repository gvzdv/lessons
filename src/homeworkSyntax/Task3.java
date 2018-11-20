package homeworkSyntax;

public class Task3 {
    public static void main(String[] args) {
//        while (true){
//            new Dog("");
//        }

        Dog dog1 = new Dog("Jack", 10, 20);
        Dog dog2 = new Dog("Bob");
        Dog dog3 = new Dog("Arnie", 7);
        Dog dog4 = new Dog(40, "brown");
        Dog dog5 = new Dog(27, "white", "Chaykovskogo, 11");

//        new Dog(null, 0, 0, null, null);
        System.out.println(Dog.getDogCount());
    }
}
