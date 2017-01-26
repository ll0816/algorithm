package dataStructure;

/**
 * Created by ll0816 on 1/26/17.
 */

/*
 Classical Binary Search
 Given a target integer T and an integer array A sorted in ascending order, find the index i such that A[i] == T or
 return -1 if there is no such index.
 Assumptions
 There can be duplicate elements in the array, and you can return any of the indices i such that A[i] == T.
 A = {1, 2, 3, 4, 5}, T = 3, return 2
 A = {1, 2, 3, 4, 5}, T = 6, return -1
 A = {1, 2, 2, 2, 3, 4}, T = 2, return 1 or 2 or 3

 What if A is null or A is of zero length? We should return -1 in this case.
 */

public class BinarySearch {
    int binarySearch(int[] array, int target) {
        // sanity chech
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < target) {
                left = mid + 1;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
