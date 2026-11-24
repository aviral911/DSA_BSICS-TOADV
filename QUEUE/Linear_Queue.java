package QUEUE;
class Linear_Queue {
    int arr[];
    int capacity;
    int front, rare;
    public Linear_Queue(int capacity) {
        this.capacity = capacity;
        front = 0;
        rare = 0;
        arr = new int[capacity];
    }
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[rare] = data;
        rare++;
        System.out.println("addedd Successfully");
    }
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int data = arr[front];
        front++;
        return data;
    }
    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    void display() {
         for (int i = front; i < rare; i++) {
            System.out.println(arr[i] + " ");
        } 
    }
    boolean isEmpty() {
        return front == rare;
    }
    boolean isFull() {
        return rare == capacity;
    }
}






