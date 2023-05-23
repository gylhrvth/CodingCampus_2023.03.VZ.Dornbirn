package gyula.week10.fileprocessor;


public class Main {
    static int countLines = 0;
    public static void main(String[] args) {
        String fileName = "assets/tmp/hello.csv";

        FileReader.readFile(fileName, new ILineProcess() {
            @Override
            public void processLine(String line) {
                ++countLines;
            }
        });
        System.out.println("Count Lines: " + countLines);
        FileReader.readFile(fileName, new ILineProcess() {
            @Override
            public void processLine(String line) {
                System.out.println(line);
            }
        });

    }
}
