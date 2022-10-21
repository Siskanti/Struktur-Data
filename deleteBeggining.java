// class LinkedList {
//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int dt) {
//             data = dt;
//             next = null;
//         }
//     }

//     public void insertAtBeginning(int new_data) {
//         Node new_node = new Node(new_data);
//         new_node.next = head;
//         head = new_node;
//     }

//     public void insertAtLast(int new_data) {
//         Node newnode = new Node(new_data);
//         if (head == null) {
//             head = newnode;
//             return;
//         }
//         Node current = head;
//         while (current.next != null) {
//             current = current.next;
//         }
//         current.next = newnode;
//     }

//     // Delete beginning

//     public void deleteBeginning() {
//       if(head==null) {
//         return;
//       }
//       head = head.next;
//     }

//     // Delete last

//     public void deleteLast() {
//       if(head==null) {
//         return;
//       }
//       if(head.next==null) {
//         head = null;
//         return;
//       }
//       Node current = head;
//       while(current.next.next!=null) {
//         current = current.next;
//       }
//       current.next = null;
//     }

//     public void printList() {
//         Node tnode = head;
//         while (tnode != null) {
//             System.out.print(tnode.data + "-->");
//             tnode = tnode.next;
//         }
//         System.out.println("null");
//     }

//     // Mencari index dari sebuah data pada list

//     public void getList(int aData) {
//       Node node = head;
//       for(int i = 0; true; i++) {
//         if(aData == node.data) {
//           System.out.println(aData + " : index ke-" + i);
//           return;
//         } else if(node.next == null) {
//           System.out.println("Tidak ada data " + aData + " pada list");
//           return;
//         }
//         node = node.next;
//       }
//     }

//     public static void main(String[] args) {
//         LinkedList slist = new LinkedList();
//         slist.insertAtBeginning(99);
//         slist.insertAtBeginning(11);
//         slist.insertAtLast(5);
//         slist.insertAtBeginning(10);
//         slist.insertAtLast(15);
//         slist.printList();
//         // 10-->11-->99-->5-->15-->null
//         slist.getList(11);
//     }

// }