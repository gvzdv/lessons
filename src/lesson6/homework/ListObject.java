package lesson6.homework;

public class ListObject{
    protected Object obj;
    protected ListObject prev;
    protected ListObject next;
    protected int index;

    public ListObject(Object obj, ListObject prev, ListObject next) {
        this.obj = obj;
        this.prev = prev;
        this.next = next;
    }

    public ListObject(Object obj, int index) {
        this.obj = obj;
        this.index = index;
    }

    public ListObject(Object obj) {
        this.obj = obj;
    }

    public ListObject() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public ListObject getPrev() {
        return prev;
    }

    public void setPrev(ListObject prev) {
        this.prev = prev;
    }

    public ListObject getNext() {
        return next;
    }

    public void setNext(ListObject next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Object: " + obj;
    }
}
