package sorting;

/**
 * Created by ll0816 on 11/16/16.
 *
 * input: {4, 2, -3, 6, 1}
 * output: {-3, 1, 2, 4, 6}
 *
 * time: O(n + nlog(n)) = O(nlog(n))
 * space: O(n + log(n)) = O(n)
 */

public class MergeSort {
    int[] mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        int[] tmp = new int[array.length];
        helper(array, 0, array.length - 1, tmp);
        return array;
    }

    private void helper(int[] array, int left, int right, int[] tmp) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        helper(array, left, mid, tmp);
        helper(array, mid + 1, right, tmp);
        merge(array, left, mid, right, tmp);
    }

    private void merge(int[] array, int left, int mid, int right, int[] tmp) {
        for (int i = left; i <= right; i++) {
            tmp[i] = array[i];
        }
        int leftBound = left;
        int rightBound = mid + 1;
        while (leftBound <= mid && rightBound <= right) {
            if (tmp[leftBound] <= tmp[rightBound]) {
                array[left++] = tmp[leftBound++];
            } else {
                array[left++] = tmp[rightBound++];
            }
        }
        while (leftBound <= mid) {
            array[left++] = tmp[leftBound++];
        }
    }

    /*
     * merge sort by using LinkedList
     * time : O(nlog(n) + nlog(n)) = O(nlog(n))
     * space : O(log(n))
     */
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = getMiddle(head);
        Node next = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(next);
        Node sortedList = mergeLinkedList(left, right);
        return sortedList;
    }

    private Node mergeLinkedList(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node tmp = null;
        if (head1.val < head2.val) {
            tmp = head1;
            tmp.next = mergeLinkedList(head1.next, head2);
        } else {
            tmp = head2;
            tmp.next = mergeLinkedList(head1, head2.next);
        }
        return tmp;
    }

    private Node getMiddle(Node head) {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
