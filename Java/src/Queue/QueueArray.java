package Queue;

public class QueueArray {
    int[] arr = new int[5];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == arr.length - 1) return;
        arr[++rear] = x;
    }

    void dequeue() {
        if (front > rear) return;
        front++;
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();

        q.display(); // 2 3
    }
}