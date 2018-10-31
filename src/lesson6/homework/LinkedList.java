package lesson6.homework;

public class LinkedList {
    protected Object head;
    protected Object tail;
    protected ObjectInfo info;
    private int listSize;

    public int size() {
        return listSize;
    }

    public void addBack(ObjectInfo info) {
        listSize++;
        if (head == null) {
            head = new Object(info, null, null);
            tail = head;
        } else {
            Object obj = new Object(info, null, tail);
            this.tail.next = obj;
            this.tail = obj;
        }
    }
    public void addFront(ObjectInfo info) {
        listSize++;
        if (head == null) {
            head = new Object(info, null, null);
            tail = head;
        } else {
            Object obj = new Object(info, head, null);
            this.head.prev = obj;
            this.head = obj;
        }
    }

    public ObjectInfo removeBack() {
        String result = null;
        if (head != null) {
            listSize--;
            result = tail.getInfo();
            if (tail.prev != null) {
                tail.prev.next = null;
                tail = tail.prev;
            } else {
                head = null;
                tail = null;
            }
        }
        return result;
    }

    public ObjectInfo removeFront() {
        ObjectInfo result = null;
        if (head != null) {
            listSize--;
            result = head.getInfo();
            if (head.next != null) {
                head.next.prev = null;
                head = head.next;
            } else {
                head = null;
                tail = null;
            }
        }
        return result;
    }



}
