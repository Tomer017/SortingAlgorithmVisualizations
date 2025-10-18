package SortingAlgorithmVisualizations.algorithms;

import java.util.Arrays;

public class MergeSort implements ISortingAlgorithm {
    private SortFrames sortFrames;

    @Override
    public int[] sort(int[] a) {
        sortFrames = new SortFrames(a);
        if (a.length < 2) return a;

        int mid = a.length / 2;

        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        sort(left);
        sort(right);

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];

            }
            else {
                a[k++] = right[j++];

            }
        }

        while (i < left.length){
            a[k++] = left[i++];
        }
        while (j < right.length){
            a[k++] = right[j++];
        }

        return a;
    }

    @Override
    public SortFrames getSortFrames() {
        return sortFrames;
    }
}
