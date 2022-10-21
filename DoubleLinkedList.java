import java.util.LinkedList;

public class DoubleLinkedList {
    Node head;
    Node tail;

    // tugas
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertMiddle(int data, int state) {
        Node newNode = new Node(data);
        if (state == 0) {
            insertHead(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < state - 1; i++) {
            current = current.next;
            if (current == null) {
                System.out.println("tidak ada indeks");
                return;
            }
        }
        if (current.next == null) {
            insertEndy(data);
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteMiddle(int position) {
        if (position == 0) {
            deleteHead();
            return;
        }
        Node current = head;
        for (int i = 0; i < position-1; i++) {
            current = current.next;
            if (current.next == null) {
                System.out.println("Tidak ada index");
                return;
            }
        }
        if (current.next.next == null) {
            deleteEnd();
            return;
        }
        current.next.next.prev = current;
        current.next = current.next.next;
    }


    public void Searching(int Data) {
        Node node = head;
        boolean a = false;
        while(node != null){    
        int index = 0;
            if (node.data == Data){
                System.out.println(Data + "node ke-" + index);

            }
            node = node.next;
            index++;
        }
        if(!a){
            System.out.println("tidak ada di list");
        }
    }
        

    // kodingan kuliah
    // @Override
    public void insertHead(int value) {

        Node newNode = new Node(value);

        if (head != null) {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        } else {
            head = newNode;
            tail = newNode;
        }

    }

    // @Override
    public void insertEndx(int value) {

        Node new_node = new Node(value);
        Node temp = head;
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (temp.next != null)
            temp = temp.next;
        temp.next = new_node;

        new_node.prev = temp;
        tail = new_node;

    }

    // @Override
    public void insertEndy(int value) {

        Node newNode = new Node(value);

        if (head != null) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            insertHead(value);
        }
    }

    // @Override
    public void deleteHead() {

        //
        if (head == null) {
            return;
        }
        head.prev = null;
        head = head.next;

    }

    // @Override
    public void deleteEnd() {

        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;

    }

    // @Override
    public void printNodes() {
        Node current = head;

        if (current != null) {
            System.out.print("null <--");
        }

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" <--> ");
            }
            current = current.next;
        }
        System.out.print("--> null");
    }

    // @Override

    public void printNodesBackwards() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertHead(69);
        dll.insertHead(70);
        dll.insertHead(12);
        // // dll.printNodes();
        // dll.insertEndx(50);
        // dll.insertEndy(1);
        // dll.deleteHead();
        // dll.deleteEnd();
        // // dll.printNodes();
        // dll.printNodesBackwards();
        dll.printNodes();
        System.out.println();
        // dll.deleteMiddle(1);
        dll.insertMiddle(3, 99);
        dll.printNodes();

        System.out.println();
        dll.printNodesBackwards();
        dll.Searching(50);
    }
}

// tambahkan insert & delete di middle
// tambahkan search --> 50 (tampilkan node berada di node ke -x) atau "tidak ada
// dalam list"
