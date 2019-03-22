package marsmission.dataaccess;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadFile {

    public Scanner iStream = null;
    private String fileName;

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }

    // readFile was returning an error when parsing the String directly into the function, so I'm using a set and get for it. WeirdO.
    public void readFile(){
        try {
            iStream = new Scanner(new File(getFileName()));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + fileName);
        }

        System.out.println("The file " + fileName + " \ncontains the following lines:\n");

        while(iStream.hasNextLine()) {
            String line = iStream.nextLine();
            System.out.println(line);
        }
        iStream.close();
    }
}
