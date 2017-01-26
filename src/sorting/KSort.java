package sorting;

import java.util.PriorityQueue;

/**
 * Created by ll0816 on 12/4/16.
 * <p>
 * time : O(nlog(k))
 * space: O(k)
 */
public class KSort {
    int[] kSort(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i <= Math.min(k, array.length - 1); i++) {
            minHeap.offer(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (i + k + 1 < array.length) {
                minHeap.offer(array[i + k + 1]);
            }
            array[i] = minHeap.poll();
        }
        return array;
    }
}
