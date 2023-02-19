// узел для однонаправленного связанного списка
public class Node<T> {

    private T value;
    private Node next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {         // конструктор при создании ноды, присваивается значение ноде
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(T value) {
        this.value = value;
    }
}
