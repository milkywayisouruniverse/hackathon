import java.util.PriorityQueue;

public class KLargest {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        System.out.println("K largest elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
