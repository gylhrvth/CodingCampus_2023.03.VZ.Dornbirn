package joachim.week11.folder;

import java.io.File;
import java.util.Objects;

public class SearchOverallMatch extends FileReciever {
    String regex;
    int amount;

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    void onFileRecieved(int depth, File file) {
            if (file.isFile() && file.getName().endsWith(regex)) {
                amount++;
        }
    }
}