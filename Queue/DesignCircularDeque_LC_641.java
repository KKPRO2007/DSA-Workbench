// LeetCode 641
public class DesignCircularDeque_LC_641 {
    private final int[] arr;
    private int front;
    private int rear;
    private int size;

    public DesignCircularDeque_LC_641(int k) {
        arr = new int[k];
        front = 0;
        rear = k - 1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + arr.length) % arr.length;
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % arr.length;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + arr.length) % arr.length;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public static void main(String[] args) {
        DesignCircularDeque_LC_641 dq = new DesignCircularDeque_LC_641(3);
        System.out.println(dq.insertLast(1));
        System.out.println(dq.insertLast(2));
        System.out.println(dq.insertFront(3));
        System.out.println(dq.getRear());
        System.out.println(dq.isFull());
        System.out.println(dq.deleteLast());
        System.out.println(dq.insertFront(4));
        System.out.println(dq.getFront());
    }
}