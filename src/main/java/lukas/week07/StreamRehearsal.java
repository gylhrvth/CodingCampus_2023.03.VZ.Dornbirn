package lukas.week07;

import java.io.*;
import java.util.Scanner;

public class StreamRehearsal {
    public static void main(String[] args) {
        File file = new File("/tmp/output.txt");
        try {
            PrintStream ps = new PrintStream(file);
            ps.println("Hello World!");
            close(ps);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            for (int i = 0; i < 100; i++) {
                writer.write("Nochmal Hello World!!! " + i);
                if (Math.random() > 0.95) {
                    throw new IOException("Line could not be written");
                }
                writer.flush();
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Buffered writer has been closed");
            close(writer);
        }

        System.out.println("---");

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));

            String input = reader.readLine();
            while (input != null) {
                System.out.println(input);
                input = reader.readLine();
            }

            //Shorter variant
//            String input;
//            while((input = reader.readLine()) != null) {
//                System.out.println(input);
//            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            close(reader);
        }

        System.out.println("---");

        int a = 10;
        int b = 20;
        //Die Zuweisung steht für den Wert selbst!
        System.out.println(a = b);

        System.out.println("--- SCANNER ---");

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            close(scanner);
        }
    }

    private static void close(Closeable reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                //noop
            }
        }
    }
}
