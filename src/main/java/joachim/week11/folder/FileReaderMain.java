package joachim.week11.folder;

import java.io.File;

public class FileReaderMain {
    public static void main(String[] args) {
        DatenSumme ds = new DatenSumme();
        SearchOverallMatch sOM = new SearchOverallMatch();
        File file = new File("C:\\Users\\Joach\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\java\\lukas");

        sOM.setRegex("java");
        sOM.onFileRecieved(0, file);
        System.out.println(sOM.getAmount());

        ds.onFileRecieved(0,file);
        System.out.println(ds.getFilesum());
    }
}
