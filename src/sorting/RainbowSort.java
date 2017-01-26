package sorting;

/**
 * Created by ll0816 on 12/1/16.
 * <p>
 * input: {4, 2, -3, 6, 1}
 * output: {-3, 1, 2, 4, 6}
 * <p>
 * time: O(n)
 * space: O(1)
 */

public class RainbowSort {
    int[] rainbowSort(int[] array) {
        // sanity check
        if (array == null || array.length <= 1) {
            return array;
        }
        int i = 0;
        int j = array.length - 1;
        int k = 0;
        while (k <= j) {
            if (array[k] == -1) {
                swap(array, i++, k++);
            } else if (array[k] == 1) {
                swap(array, k, j--);
            } else {
                k++;
            }
        }
        return array;
    }

    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
