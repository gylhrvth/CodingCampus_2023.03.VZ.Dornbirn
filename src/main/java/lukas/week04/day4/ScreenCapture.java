package lukas.week04.day4;

import javax.management.monitor.Monitor;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.util.Arrays;
import java.util.Date;

public class ScreenCapture {

    public static void main(String[] args) {

        try {

            Robot robot = new Robot();

            // Capture a particular area on the screen

            int x1 = 0;

            int y1 = 0;

            int width = 300;

            int height = 300;

            Rectangle area = new Rectangle(x1, y1, width, height);

            BufferedImage bufferedImage = null;


            long start = System.currentTimeMillis();
            int frames = 0;

            while (true) {
                BufferedImage newImage = robot.createScreenCapture(area);
                if (bufferedImage != null) {
                    int[] arr = ((DataBufferInt) bufferedImage.getRaster().getDataBuffer()).getData();
                    int[] arr2 = ((DataBufferInt) newImage.getRaster().getDataBuffer()).getData();
                    if (!Arrays.equals(arr, arr2)) {
                        System.out.println("Detected movement" + Math.random());
                    }
                }
                bufferedImage = newImage;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException exc) {
                    //noop
                }
                frames++;

                if (frames % 100 == 0) {
                    System.out.println("Took 100 frames in: " + (100/((System.currentTimeMillis() - start)/1000f)));
                    start = System.currentTimeMillis();
                    frames = 0;
                }
            }
        } catch (AWTException e) {
            System.out.println("Could not capture screen " + e.getMessage());
        }

    }
}
