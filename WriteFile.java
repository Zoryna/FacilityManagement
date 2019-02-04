import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteFile {
    public String fileName;
    PrintWriter oStream = null;

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }

    public void saveFacilityInfo(Facility fac){

        try {
            oStream = new PrintWriter(getFileName());
        }
        catch (FileNotFoundException e) {
            System.out.println("Error saving the file " + fileName + ". I can't provide more information because I'm a computer. Beep Boop.");
            System.exit(0);
        }

        // This thing can probably be improved with some data structure to get the functions, maybe a loop with a switch statement.
        int i = 0;
        String name = fac.getName();
        oStream.println(i + ": " + name + ".");
        i++;
        String address = fac.getAddress();
        oStream.println(i + ": " + address + ".");
        i++;
        String description = fac.getDescription();
        oStream.println(i + ": " + description + ".");
        i++;
        int refNumber = fac.getRefNumber();
        oStream.println(i + ": " + refNumber + ".");
        i++;
        int capacity = fac.getCapacity();
        oStream.println(i + ": " + capacity + ".");
        i++;
        double cost = fac.getCost();
        oStream.println(i + ": " + cost + ".");
        i++;
        int problemRate = fac.getProblemRate();
        oStream.println(i + ": " + problemRate + ".");

        oStream.close();
        System.out.println("File has been saved.");
    }
}
