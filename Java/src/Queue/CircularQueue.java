package Queue;

public class CircularQueue {
    int[] arr = new int[5];
    int front = -1, rear = -1;

    void enqueue(int x) {
        if ((rear + 1) % arr.length == front) return;

        if (front == -1) front = 0;
        rear = (rear + 1) % arr.length;
        arr[rear] = x;
    }

    void dequeue() {
        if (front == -1) return;

        if (front == rear) front = rear = -1;
        else front = (front + 1) % arr.length;
    }

    void display() {
        if (front == -1) return;

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % arr.length;
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();
        q.enqueue(4);

        q.display(); // 2 3 4
    }
}