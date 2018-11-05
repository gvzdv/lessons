package lesson6.homework;

public interface List {
    void add(ListObject obj, int index); // добавляет объект на указанную позицию (index)
    void remove(int index); // удаляет элемент с указанной позиции (index)
    ListObject get(int index); // находит и возвращает элемент по индексу (index)
    int size(); // возвращает размер списка
}
