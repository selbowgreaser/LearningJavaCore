import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        int[] sortedArray = mergeArrays(a1, a2);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int n = a1.length;
        int m = a2.length;
        int[] sortedArray = new int[n + m];
        for (int i = 0, j = 0, k = 0; k < n + m; k++) {
            if ((i < n && j < m && a1[i] < a2[j]) || (i < n && j >= m)) {
                sortedArray[k] = a1[i];
                i++;
            } else {
                sortedArray[k] = a2[j];
                j++;
            }
        }
        return sortedArray;
    }
}
