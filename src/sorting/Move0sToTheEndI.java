package sorting;

/**
 * Created by ll0816 on 12/11/16.
 */
public class Move0sToTheEndI {
    int[] moveZero(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] == 0) {
                swap(array, i, j--);
            } else {
                i++;
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
