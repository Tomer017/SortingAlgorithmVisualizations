package SortingAlgorithmVisualizations.Utility;

import SortingAlgorithmVisualizations.App;
import SortingAlgorithmVisualizations.algorithms.SortFrames;

import javax.swing.*;
import java.awt.*;

public class SortVisualizer extends JComponent {
    SortFrames sortFrames;
    int rectangleSpacing;
    private int rectWidth;
    private int rectHeight;
    int[] frame;
    public SortVisualizer(SortFrames sortFrames, int rectSpacing) {
        this.sortFrames = sortFrames;
        rectangleSpacing = rectSpacing;
        rectWidth = getWidth() / sortFrames.peekFrame().length;
        rectHeight = getHeight() / sortFrames.peekFrame().length;
        rectWidth = rectWidth -  2 * rectangleSpacing;
        rectHeight = rectHeight - 2;

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (frame == null)
            return;
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int maxHeight = 0;
        for (int j : frame) {
            maxHeight = Math.max(j, rectHeight);
        }

        for (int i = 0; i < frame.length; i++) {
            g2d.setColor(Color.BLACK);
            int height = (int) ((i / (float)maxHeight) * rectHeight);

            System.out.println(rectWidth);
            g2d.fillRect((rectWidth + rectangleSpacing) * i, 0 , rectWidth, height);
        }
    }
    public void frame() {
        frame = sortFrames.getFrame();
        App.printArray(frame);
        this.repaint();
    }
}
