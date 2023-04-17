package lukas.week04.day4;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("unused")
public class ScreenCapture {
    private static BufferedImage bufferedImage = null;

    public static void main(String[] args) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (bufferedImage != null) {
                    g.drawImage(bufferedImage, 0, 0, getWidth(), getHeight(), null);
                }
            }
        };

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setAlwaysOnTop(true);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Writing BOT
//        new Thread(() -> {
//            try {
//                Robot robot = new Robot();
//                while (true) {
//                    try {
//                        robotWriteText("Was geht ab", robot);
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }).start();

        //Magnifying glass
        new Thread(() -> {
            try {
                Robot robot = new Robot();
                int width = 100;
                int height = 100;

                Rectangle area = new Rectangle(0, 0, width, height);

                long start = System.currentTimeMillis();
                int frames = 0;


                while (true) {
                    Point point = MouseInfo.getPointerInfo().getLocation();
                    area.x = point.x - width / 2;
                    area.y = point.y - height / 2;
                    BufferedImage newImage = robot.createScreenCapture(area);

//                    //Modify colors of BufferedImage
//                    for(int row = 0; row < width; row ++) {
//                        for(int col = 0; col < height; col++) {
//                            int rgb = newImage.getRGB(col, row);
//                            int blue = getBlue(rgb);
//                            int green = getGreen(rgb);
//                            int red = getRed(rgb);
//                            double rand = Math.random();
//                            if(rand >= 0.66) {
//                                blue = 0;
//                            } else if(rand >= 0.33) {
//                                green = 0;
//                            } else {
//                                red = 0;
//                            }
//                            int newRgb = toRGB(red, green, blue);
//                            newImage.setRGB(col, row,  newRgb);
//                        }
//                    }
                    panel.repaint();

//                    //Check for movement and move cursor to this position, not working properly
//                    if (bufferedImage != null) {
//                        int[] arr = ((DataBufferInt) bufferedImage.getRaster().getDataBuffer()).getData();
//                        int[] arr2 = ((DataBufferInt) newImage.getRaster().getDataBuffer()).getData();
//                        for (int i = 0; i < arr.length; i++) {
//                            if (arr[i] != arr2[i]) {
//                                int y = i / width;
//                                int x = i % width;
//                                System.out.println("Movement detected [" + x + "/" + y + "]");
//                                robot.mouseMove(x, y);
//                                break;
//                            }
//                        }
//                        //                    if (!Arrays.equals(arr, arr2)) {
////                        System.out.println("Detected movement" + Math.random());
////                    }
//                    }
                    bufferedImage = newImage;
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException exc) {
                        //noop
                    }
                    frames++;

                    if (frames % 100 == 0) {
                        System.out.println("fps: " + (100 / ((System.currentTimeMillis() - start) / 1000f)));
                        start = System.currentTimeMillis();
                        frames = 0;
                    }
                }
            } catch (
                    AWTException e) {
                System.out.println("Could not capture screen " + e.getMessage());
            }
        }).start();
    }

    private static void robotWriteText(String text, Robot robot) {
        for (char c : text.toCharArray()) {
            int keyCode = java.awt.event.KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }
    }

    private static int getRed(int color) {
        return color >> 16;
    }

    private static int getGreen(int color) {
        return color >> 8 & 255;
    }

    private static int getBlue(int color) {
        return color & 255;
    }

    private static int toRGB(int red, int green, int blue) {
        return red << 16 | green << 8 | blue;
    }
}
