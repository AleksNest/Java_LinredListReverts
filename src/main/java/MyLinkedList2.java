// двунаправленный связанный список

public class MyLinkedList2<T> {

    private Node2 head;
    private Node2 tail;    // ссылка на хвост

    // метод разворота двунаправленного связанного  списка
    public void revert() {
        Node2 currentNode = head;
        while (currentNode != null) {
            Node2 next = currentNode.getNext();
            Node2 previous = currentNode.getPrev();
            currentNode.setNext(previous);
            currentNode.setPrev(next);
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode =next;
        }

    }

    // метод добавления элементов в двунаправленный связанный список
    public void addFirst(int value){
        Node2 node = new Node2(value);    // генерируем новый элемент (node)
        if (head != null){      // если есть хотя бы один элемент в списке

            node.setNext(head); // новый элемент (node) указываем на бывший первый элемент head
            head.setPrev(node); // и теперь голова указывает на предыдущий элемент , а именно на новый элемент (node)
            //head = node;      // и теперь назначаем голову, как новый элемент (node)
        }
        else {                  // нет ни одного элемента в списке
            //head = node;
            tail = node;
        }
        head = node;
    }

    // метод печати двунаправленного связанного списка
    public  void printLinkedList2 (MyLinkedList2 list) {
        Node2 currNode = list.head;

        System.out.print("LinkedList2: ");


        while (currNode != null) {                      // проход через список
            System.out.print(currNode.getValue() + " ");      // Печатаем данные в текущем узле
            currNode = currNode.getNext();               // переход к след ноде
        }

        System.out.println();
    }

}
