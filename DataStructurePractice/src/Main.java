import com.datastructure.linkedlist.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        singlyLinkedListOperations();
    }

    public static void singlyLinkedListOperations() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);

        System.out.println(list.toString());

        list.insert(10,2);
        System.out.println(list.toString());

        list.removeFromBeginning();
        System.out.println(list.toString());

        list.removeFromEnd();
        System.out.println(list.toString());

        list.removeNode(new SinglyLinkedList().new Node(10));
        System.out.println(list.toString());

        list.remove(1);
        System.out.println(list.toString());

        System.out.println(list.length());

        list.clear();
        System.out.println(list.toString());
    }
}