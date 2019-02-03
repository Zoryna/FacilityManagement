import java.io.*;
import java.util.*;

public class WriteFile {
    private String fileName = "facilityinfo.txt";
    PrintWriter oStream = null;

    public void saveFacilityInfo(Facility fac){
        try {
            oStream = new PrintWriter(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error saving the file " + fileName + ". I can't provide more information because I'm a computer. Beep Boop.");
            System.exit(0);
        }

        String name = fac.getName();
        oStream.println("0: " + name + ".");
        oStream.close();
        System.out.println("File has been saved.");
    }

    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        Facility fac = new Facility("Airlock #0", 0);
        wf.saveFacilityInfo(fac);
    }
}
