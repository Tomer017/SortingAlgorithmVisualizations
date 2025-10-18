package SortingAlgorithmVisualizations;

import SortingAlgorithmVisualizations.Utility.SortVisualizer;
import SortingAlgorithmVisualizations.algorithms.InsertionSort;
import SortingAlgorithmVisualizations.algorithms.MergeSort;
import SortingAlgorithmVisualizations.algorithms.SortFrames;

import javax.swing.*;

public class App {
    public static void populateArray(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 100) + 1;
        }

    }
    public static void printArray(int[] a){
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        int[] array = new int[20];
        populateArray(array);

        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        SortFrames sortFrames = new SortFrames(array);
        InsertionSort insertion = new InsertionSort();
        insertion.sort(array);
        printArray(array);
        SortFrames frames = insertion.getSortFrames();
        while (frames.hasNext()) {
            printArray(frames.getFrame());
        }


        /**
        SortVisualizer visualizer = new SortVisualizer(frames, 5);
        frame.add(visualizer);
        System.out.println(frames.hasNext());
        while (frames.hasNext()) {
            visualizer.frame();
            Thread.sleep(15);
        } **/
    }
}
