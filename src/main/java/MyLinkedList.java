// однонаправленный связанный список

public class MyLinkedList <T> {

    private Node head;




    // методы разворота однонаправленного связанного списка
    private void revert (Node currentNode, Node previousNode) {
        if (currentNode.getNext() == null) {        // при условии списка состоящего из одного элемента
            head = currentNode;
        } else {                                    // при условии списка из более одного элемента
            revert (currentNode.getNext(), currentNode);
        }
        currentNode.setNext(previousNode);          // текущая нода
    }

    public void revert() {
        if (head != null && head.getNext() !=null){// для случая наличия первого и второго элементов списка
            Node temp = head;
            revert(head.getNext(), head);
            temp.setNext(null);
        }

    }



    // метод добавления элемента в конец списка
    public void addLast(T value){
        Node node = new Node(value);    // создали узел со значением
        if (head == null){              // если нет ни одного элемента в списке
            head = node;
        }
        else{
            Node last = head;           // стоим на первом элементе
            while (last.getNext() != null){   // проход по списку:
                last = last.getNext();        // вызываем ссылку на след ноду, доходим до последнего элемента (ноды)
            }
            last.setNext(node);             // запись в последнюю позицию новую ноду
        }
    }


    // метод печати однонаправленного связанного списка
    public  void printLinkedList(MyLinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");


        while (currNode != null) {                      // проход через список
            System.out.print(currNode.getValue() + " ");      // Печатаем данные в текущем узле
                currNode = currNode.getNext();               // переход к след ноде
        }

        System.out.println();
    }

}
