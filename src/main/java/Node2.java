// узел для двунаправленного связанного  списка
public class Node2 <T>{

    private int value;
    private Node2 next;
    private Node2 prev;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    public Node2 getPrev() {
        return prev;
    }

    public void setPrev(Node2 prev) {
        this.prev = prev;
    }


    public Node2(int value) {  // конструктор для value
        this.value = value;
    }
}
