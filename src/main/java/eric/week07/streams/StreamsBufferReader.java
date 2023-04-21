package eric.week07.streams;

import java.io.*;

public class StreamsBufferReader {
    public static void main(String[] args) {
        File file = new File("assets/tmp/Logging.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception Thrown!");
            //noop
        }
    }
}
