// Circular Queue implementation in Java

public class CircularQueue {
    int SIZE = 5; // Size of Circular Queue
    int FRONT, REAR;
    int items[] = new int[SIZE];
  
    CircularQueue() {
      FRONT = -1;
      REAR = -1;
    }
  
    // Check if the queue is full
    boolean isFull() {
      if (FRONT == 0 && REAR == SIZE - 1) {
        return true;
      }
      if (FRONT == REAR + 1) {
        return true;
      }
      return false;
    }
  
    // Check if the queue is empty
    boolean isEmpty() {
      if (FRONT == -1)
        return true;
      else
        return false;
    }
  
    // Adding an element
    void enQueue(int element) {
      if (isFull()) {
        System.out.println("Queue is full");
      } else {
        if (FRONT == -1)
          FRONT = 0;
        REAR = (REAR + 1) % SIZE;
        items[REAR] = element;
        System.out.println("Inserted " + element);
      }
    }
  
    // Removing an element
    int deQueue() {
      int element;
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      } else {
        element = items[FRONT];
        if (FRONT == REAR) {
          FRONT = -1;
          REAR = -1;
        } /* Q has only one element, so we reset the queue after deleting it. */
        else {
          FRONT = (FRONT + 1) % SIZE;
        }
        return (element);
      }
    }
  
    void display() {
      /* Function to display status of Circular Queue */
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      } else {
        System.out.println("FRONT -> " + FRONT);
        System.out.println("Items -> ");
        for (i = FRONT; i != REAR; i = (i + 1) % SIZE)
          System.out.print(items[i] + " ");
        System.out.println(items[i]);
        System.out.println("REAR -> " + REAR);
      }
    }
  
    public static void main(String[] args) {
  
      CircularQueue queue = new CircularQueue();
  
      // Fails because FRONT = -1
      queue.deQueue();
  
      queue.enQueue(1);
      queue.enQueue(2);
      queue.enQueue(3);
      queue.enQueue(4);
      queue.enQueue(5);
  
      // Fails to enqueue because FRONT == 0 && REAR == SIZE - 1
      queue.enQueue(6);
  
      queue.display();
  
      int elem = queue.deQueue();
  
      if (elem != -1) {
        System.out.println("Deleted Element is " + elem);
      }
      queue.display();
  
      queue.enQueue(7);
  
      queue.display();
  
      // Fails to enqueue because FRONT == REAR + 1
      queue.enQueue(8);
    }
  
  }