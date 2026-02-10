import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        System.out.println("Kth Largest Element = " + minHeap.peek());
    }
}
