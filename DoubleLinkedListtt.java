// public class DoubleLinkedList implements LinkedList {
//     Node head;
//     Node tail;
//     @Override
//     public void insertAtBeginning(int value){
//         Node newNode = new Node(value);
//         if (head != null){
//             newNode.next = head;
//             head.prev = newNode;
//             head=newNode;


//         }else{
//             head = newNode;
//             tail = newNode;
//         }
//         head=newNode;
//         tail=newNode;


//     }
//     @Override
//     public void printNodes(){
//         Node current = head;
//         while(current != null){
//             System.out.println(current.value);
//             current = current.next;
            



//         }
//     }
// }
