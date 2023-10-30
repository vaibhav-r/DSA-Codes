
import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr) {
    Integer[] integers = new Integer[arr.length];
    for (int i = 0; i < arr.length; i++) {
        integers[i] = arr[i];
    }

    Arrays.sort(integers, new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            int bitCountA = Integer.bitCount(a);
            int bitCountB = Integer.bitCount(b);

            if (bitCountA == bitCountB) {
                return a - b; // Sort by ascending order if bit counts are equal
            }

            return bitCountA - bitCountB;
        }
    });

    for (int i = 0; i < arr.length; i++) {
        arr[i] = integers[i];
    }

    return arr;
}
}