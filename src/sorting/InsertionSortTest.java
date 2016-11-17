package sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by ll0816 on 11/17/16.
 */
public class InsertionSortTest {

    private InsertionSort sort;
    @Before
    public void setUp() throws Exception {
        sort = new InsertionSort();
    }

    @After
    public void tearDown() throws Exception {
        sort = null;
    }

    @Test
    public void test1() {
        int[] input = new int[] {3, 2, 6, 4, 1};
        assertArrayEquals(new int[] {1, 2, 3, 4, 6}, sort.sortI(input));
        assertArrayEquals(new int[] {1, 2, 3, 4, 6}, sort.sortII(input));
    }

    @Test
    public void test2() {
        int[] input = new int[] {3, 3, 6, 4, 1};
        assertArrayEquals(new int[] {1, 3, 3, 4, 6}, sort.sortI(input));
        assertArrayEquals(new int[] {1, 3, 3, 4, 6}, sort.sortII(input));
    }
}