package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ll0816 on 12/1/16.
 * <p>
 * when range << n, it's the best.
 * <p>
 * time : O(range + n)
 * space : O(range)
 * <p>
 * input: {1, 4, 1, 2, 7, 5, 2}, range [0, 9]
 * output: {1, 1, 2, 2, 4, 5, 7}
 */
public class CountingSort {
    int[] countingSort(int[] array, int lo, int up) {
        int[] count = new int[up - lo + 1];
        for (int num : array) {
            count[num - lo]++;
        }
        int cur = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[cur++] = i + lo;
                count[i]--;
            }
        }
        return array;
    }

    static class Element {
        String[] key;
        int val;

        public Element(String[] key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Element[] countingSort(Element[] array, int lo, int up) {
        List<List<Element>> count = new ArrayList<>(up - lo + 1);
        for (int i = 0; i < count.size(); i++) {
            count.add(new ArrayList<>());
        }
        for (Element ele : array) {
            count.get(ele.val - lo).add(ele);
        }
        int cur = 0;
        for (List<Element> list : count) {
            for (Element ele : list)
                array[cur++] = ele;
        }
        return array;
    }
}
