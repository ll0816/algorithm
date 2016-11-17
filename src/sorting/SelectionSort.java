package sorting;

/**
 * Created by ll0816 on 11/16/16.
 */
public class SelectionSort {

    int[] sort(int[] array) {
        int global_min;
        for (int i = 0; i < array.length; i++) {
            global_min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[global_min] > array[j]) {
                    global_min = j;
                }
            }
            swap(array, global_min, i);
        }
        return array;
    }

    private void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
