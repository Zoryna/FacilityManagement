package marsmission.domain;
import marsmission.dataaccess.ReadFile;

public class TestReadFile {
    public static void main(String[] args){
        ReadFile rf = new ReadFile();

        // ReadFile test outputs
        rf.setFileName("Saved.txt");
        rf.readFile();
    }
}
