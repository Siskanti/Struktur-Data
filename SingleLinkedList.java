import java.util.LinkedList;

public class SingleLinkedList {
    Node head;

    class Node {
        int data1;
        Node pointer;

        Node(int data2) {
            data1 = data2;
            pointer = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.pointer = head;
        head = node;
    }

    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.pointer != null) {
            current = current.pointer;
        }
        current.pointer = node;
    }

    public void insertMiddle(int data, int state) {
        if (state == 0) {
            insertAtBeginning(data);
        }
        Node current = head;
        for (int i = 0; i < state - 1; i++) {
            current = current.pointer;
            if (current == null) {
                System.out.println("tidak ada indeks");
                return;
            }
        }
        Node newNode = new Node(data);
        newNode.pointer = current.pointer;
        current.pointer = newNode;
    }

    public void deleteBeginning() {
        if (head == null) {
            return;
        }
        head = head.pointer;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.pointer == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.pointer.pointer != null) {
            current = current.pointer;
        }
        current.pointer = null;
    }

    public void Searching(int Data) {
        Node node = head;
        for (int i = 1; true; i++) {
            if (Data == node.data1) {
                System.out.println(Data + " : index ke- " + i);
                return;
            } else if (node.pointer == null) {
                System.out.println("Tidak ada data " + Data + " pada list");
                return;
            }
            node = node.pointer;
        }
    }

    public void print() {
        Node print_node = head;
        while (print_node != null) {
            System.out.print(print_node.data1 + "---->");
            print_node = print_node.pointer;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Linked list = new Linked();
        list.insertAtBeginning(23);
        list.insertAtBeginning(10);
        list.insertAtLast(2);
        list.insertAtBeginning(12);
        list.insertAtLast(18);
        list.deleteBeginning();
        list.Searching(18);
        list.insertMiddle(3,2);
        list.printList();
        list.insertAtLast(2021);
        list.deleteLast();
        
}
}
