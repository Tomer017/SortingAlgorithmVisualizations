package SortingAlgorithmVisualizations.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SortFrames {
    Queue<int[]> sortFrames;
    public SortFrames(int[] initialList) {
        sortFrames = new LinkedList<>();
        sortFrames.add(initialList);
    }
    public void addFrame(int[] frame) {
        sortFrames.add(frame);
    }
    public int[] getFrame() {
        return sortFrames.poll();
    }
    public int[] peekFrame() {
        return sortFrames.peek();
    }
    public boolean hasNext() {
        return !sortFrames.isEmpty();
    }

}
