package sorting;

/**
 * Created by ll0816 on 12/1/16.
 * <p>
 * input: {4, 2, -3, 6, 1}
 * output: {-3, 1, 2, 4, 6}
 * <p>
 * best case time = O(nlog(n))
 * worst case time =  O(n^2)
 * space = O(log(n)) constant size of stack frame
 */

// input: {4, 2, -3, 6, 1}
// output: {-3, 1, 2, 4, 6}

public class QuickSort {
    int[] quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pos = partition(array, left, right);
        quickSort(array, left, pos - 1);
        quickSort(array, pos + 1, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivotPos = randomSeed(left, right);
        int pivot = array[pivotPos];
        swap(array, pivotPos, right);
        int i = left;
        int j = right - 1;
        while (i <= j) {
            if (array[i] < pivot) {
                i++;
            } else if (array[j] > pivot) {
                j--;
            } else {
                swap(array, i++, j--);
            }
        }
        swap(array, i, right);
        return i;
    }

    private int randomSeed(int left, int right) {
        return left + (int) (Math.random() * (right - left + 1));
    }

    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
