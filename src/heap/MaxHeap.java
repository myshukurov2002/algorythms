package heap;

public class MaxHeap {
    int[] heap;
    int size;
    int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize];
    }

    int parent(int pos) {
        return (pos * 2) / 2;
    }

    int leftChild(int pos) {
        return (pos * 2) + 1;
    }

    int rightChild(int pos) {
        return (pos * 2) + 2;
    }

    boolean isLeaf(int pos) {
        return pos >= size / 2 && pos < size;
    }

    void swap(int first, int sec) {
        int temp = heap[first];
        heap[first] = heap[sec];
        heap[sec] = temp;
    }

    void insert(int element) {
        if (size >= maxSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int curr = size;
        heap[curr] = element;
        while (curr != 0 && heap[curr] > heap[parent(curr)]) {
            swap(heap[curr], heap[parent(curr)]);
            curr = parent(curr);
        }
        size++;
    }

    void heapifyDown(int pos) {

        while (!isLeaf(pos)) {
            int left = leftChild(pos);
            int right = rightChild(pos);
            int largest = pos;
            if (left < size && heap[left] > heap[largest])
                largest = left;
            if (right < size && heap[right] > heap[largest])
                largest = right;

            if (largest != pos) {
                swap(largest, pos);
                pos = largest;
            } else {
                return;
            }
        }


    }

    int remove() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        int popped = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);

        return popped;
    }

    public static void main(String[] args) {
        int a = 41;
        int b = 5;
        b = a++;
        System.out.println(b);
    }
}
