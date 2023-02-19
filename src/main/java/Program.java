public class Program {
    public static void main(String[] args) {

        MyLinkedList<Integer> mylinkedList = new MyLinkedList<>();
        mylinkedList.addLast(1);
        mylinkedList.addLast(2);
        mylinkedList.addLast(3);
        mylinkedList.addLast(4);
        mylinkedList.addLast(5);
        System.out.println("исходный одлнонаправленный связанный список");
        mylinkedList.printLinkedList(mylinkedList);
        mylinkedList.revert();
        System.out.println("перевернутый одлнонаправленный связанный список");
        mylinkedList.printLinkedList(mylinkedList);


        MyLinkedList2<Integer> mylinkedList2 = new MyLinkedList2<>();
        mylinkedList2.addFirst(5);
        mylinkedList2.addFirst(4);
        mylinkedList2.addFirst(3);
        mylinkedList2.addFirst(2);
        mylinkedList2.addFirst(1);
        System.out.println("исходный двунаправленный связанный список");
        mylinkedList2.printLinkedList2(mylinkedList2);
        mylinkedList2.revert();
        System.out.println("перевернутый двунаправленный связанный список");
        mylinkedList2.printLinkedList2(mylinkedList2);

    }
}
