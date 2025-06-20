public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedlist(int nodeValue){
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createSingleLinkedlist(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

    // Delete Method
    public void delete(int position) {
        if (head == null) {
            System.out.println("List does not exist.");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Invalid position: " + position);
            return;
        }

        if (position == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < position - 1; i++) {
            tempNode = tempNode.next;
        }

        if (position == size - 1) {
            tempNode.next = null;
            tail = tempNode;
        } else {
            tempNode.next = tempNode.next.next;
        }

        size--;
    }

    // Traverse Method
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value);
            if (currentNode.next != null) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Search Method
    public void searchNode(int nodeValue) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.value == nodeValue) {
                System.out.println("Found value " + nodeValue + " at position " + index);
                return;
            }
            currentNode = currentNode.next;
            index++;
        }
        System.out.println("Value " + nodeValue + " not found in the list.");
    }
}
