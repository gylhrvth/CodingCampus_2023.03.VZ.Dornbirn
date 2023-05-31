package joachim.week11.folder;

import java.io.File;

public class DatenSumme extends FileReciever {
    long filesum;

    @Override
    void onFileRecieved(int depth, File file){
        for(File search : file.listFiles()){
            if(search.isFile()){
                filesum += search.length();
            }else{
                onFileRecieved(depth+1,search);
            }
        }
    }

    public long getFilesum() {
        return filesum;
    }
}
