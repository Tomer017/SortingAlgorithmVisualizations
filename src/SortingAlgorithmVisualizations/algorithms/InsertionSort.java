package SortingAlgorithmVisualizations.algorithms;

public class InsertionSort implements ISortingAlgorithm {
    private SortFrames sortFrames;

    @Override
    public int[] sort(int[] a) {
        sortFrames = new SortFrames(a);

        int i = 1;

        while (i < a.length){
            int x = a[i];
            int j = 1;

            while (j > 0 && a[j-1] > a[j]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
                sortFrames.addFrame(a);
            }
            a[j] = x;
            i++;
        }
        return a;
    }

    @Override
    public SortFrames getSortFrames() {
        return sortFrames;
    }
}
