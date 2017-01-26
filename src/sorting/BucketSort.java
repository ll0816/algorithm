package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ll0816 on 12/1/16.
 * <p>
 * time:
 * best case: O(n + n + n) = O(n)
 * worst case: O(n + n^2 + n) = O(n^2)
 * space: O(n)
 * <p>
 * input:
 * output:
 */
public class BucketSort {
    double[] bucketSort(double[] array) {
        int n = array.length;
        List<List<Double>> buckets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }
        for (double d : array) {
            int index = (int) (n * d);
            buckets.get(index).add(d);
        }
        for (List<Double> bucket : buckets) {
            Collections.sort(bucket); // insertion sort
        }
        int index = 0;
        for (List<Double> bucket : buckets) {
            for (double d : bucket) {
                array[index++] = d;
            }
        }
        return array;
    }
}
