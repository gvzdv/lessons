package lesson6.homework;

public class LinkedList implements List, Queue, Stack {
    protected ListObject head;
    protected ListObject tail;
    protected int listSize;

    @Override
    public void add(ListObject obj, int index) {
        if ((index > 0) && (index < (listSize + 2))) {
            if (index == 1) {
                shift(obj);
            } else if (index == (listSize + 1)) {
                push(obj);
            } else {
                ListObject obj1 = new ListObject(get(index));
                obj.prev = obj1.prev;
                obj.next = obj1;
                listSize++;
            }
        } else {
            System.out.println("Incorrect index");
        }
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            unshift();
        } else if (index == (listSize - 1)) {
            pop();
        } else if ((index > 0) && (index < (listSize - 1))) {
            ListObject obj = get(index);
            obj.prev.next = obj.next;
            obj.next.prev = obj.prev;
            listSize--;
        } else {
            System.out.println("Incorrect index");
        }
    }

    @Override
    public ListObject get(int index) {
        if (index == 0) return head;
        else if (index == (listSize - 1)) return tail;
        else if ((index > 0) && (index < (listSize - 1))) {
            ListObject obj = head;
            for (int i = 0; i < index; i++) {
                obj = obj.next;
            }
            return obj;
        } else return null;
    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public void push(ListObject obj) {
        listSize++;
        if (head == null) {
            head = new ListObject(obj);
            tail = head;
        } else {
            obj = new ListObject(obj);
            this.tail.prev = obj;
            this.tail = obj;
        }
    }

    @Override
    public void pop() {
        if (head != null) {
            listSize--;
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;

            } else {
                head = null;
                tail = null;
            }
        }
        System.out.println("No objects in list");
    }

    @Override
    public void shift(ListObject obj) {
        listSize++;
        if (head == null) {
            head = new ListObject(obj);
            tail = head;
        } else {
            obj = new ListObject(obj);
            this.head.prev = obj;
            this.head = obj;
        }
    }

    @Override
    public void unshift() {
        if (tail != null) {
            listSize--;
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = null;
                tail = null;
            }
        }
        System.out.println("No objects in list");
    }

        protected void print(){
        ListObject objectPrint = head;
            while (objectPrint != null){
            System.out.println(objectPrint.obj);
            objectPrint = objectPrint.getNext();
        }
    }
}
