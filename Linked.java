import java.util.LinkedList;

class Linked {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int dt) {
            data = dt;
            next = null;
        }
    }

    public void insertAtBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAtLast(int new_data) {
        Node newnode = new Node(new_data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "-->");
            tnode = tnode.next;
        }
        System.out.println("null");
    }

    public void deleteBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) { // 2-->null
            head = null; // null
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void Searching(int aData) {
        Node node = head;
        for (int i = 1; true; i++) {
            if (aData == node.data) {
                System.out.println(aData + " : index ke-" + i);
                return;
            } else if (node.next == null) {
                System.out.println("Tidak ada data " + aData + " pada list");
                return;
            }
            node = node.next;
        }
    }

    public void insertMiddle(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == null) {
                System.out.println("There is no such index");
                return;
            }
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args) {
        Linked slist = new Linked();
        slist.insertAtBeginning(99);
        slist.insertAtBeginning(11);
        slist.insertAtLast(5);
        slist.insertAtBeginning(10);
        slist.insertAtLast(15);
        slist.deleteBeginning();
        slist.Searching(5);
        slist.insertMiddle(2,2);
        slist.printList();
        // 10-->11-->99-->5-->15-->null
    }

}