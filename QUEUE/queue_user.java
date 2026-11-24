
package QUEUE;

import java.util.Scanner;

public class queue_user {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Queue Size: ");
        int size = sc.nextInt();

        Linear_Queue p = new Linear_Queue(size);

        // Initial Status
        System.out.println("\nInitial Queue Status");

        System.out.println("Front: " + p.front);
        System.out.println("Rare: " + p.rare);
        System.out.println("Capacity: " + p.capacity);
        System.out.println("Is Empty: " + p.isEmpty());
        System.out.println("Is Full: " + p.isFull());

        // Enqueue Operations
        System.out.println("\nEnqueue Operations");

        p.enqueue(10);
        p.enqueue(20);
        p.enqueue(30);
        p.enqueue(40);
        p.enqueue(104);
        p.enqueue(1043);

        // Display Queue
        System.out.println("\nQueue Elements:");
        p.display();

        // Peek Operation
        System.out.println("\nFront Element: " + p.peek());

        // Dequeue Operations
        System.out.println("\nDequeue Operations");

        System.out.println("Deleted: " + p.dequeue());
        System.out.println("Deleted: " + p.dequeue());

        // Display After Dequeue
        System.out.println("\nQueue After Deletion:");
        p.display();
        
        // Final Status
        System.out.println("\nFinal Queue Status");

        System.out.println("Front: " + p.front);
        System.out.println("Rare: " + p.rare);
        System.out.println("Is Empty: " + p.isEmpty());
        System.out.println("Is Full: " + p.isFull());

        sc.close(); 

    }
}
