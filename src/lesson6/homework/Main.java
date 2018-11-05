package lesson6.homework;

public class Main {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        ListObject object = new ListObject("pig");
        ListObject object1 = new ListObject("dog");
        ListObject object2 = new ListObject("hog");
        lList.shift(object);
        lList.shift(object1);
        lList.shift(object2);
        System.out.println(lList.size());
        System.out.println(object.obj);
        System.out.println(object1.obj);
        System.out.println(object2.obj);
        lList.print();

    }
}
