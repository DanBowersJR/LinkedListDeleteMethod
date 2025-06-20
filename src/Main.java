public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        sll.insertLinkedList(1, 0);
        sll.insertLinkedList(2, 1);
        sll.insertLinkedList(3, 2);
        sll.insertLinkedList(4, 3);

        sll.traverseLinkedList();
        sll.searchNode(5);

        System.out.println("Deleting node at position 2...");
        sll.delete(2);

        sll.traverseLinkedList(); // Should print: 1 -> 2 -> 4
    }
}
