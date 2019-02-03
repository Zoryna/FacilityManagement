import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteFile {
    private String fileName = "facilityinfo.txt";
    PrintWriter oStream = null;


    public void saveFacilityInfo(Facility fac){

        int functions = 7; // This number comes from the number of informations we have in a facility. There's probably a less rigid solution than this.

        try {
            oStream = new PrintWriter(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error saving the file " + fileName + ". I can't provide more information because I'm a computer. Beep Boop.");
            System.exit(0);
        }

        for (int i = 0; i < functions; i++){
            String name = fac.getName();
            oStream.println(i + ": " + name + ".");
            String address = fac.getAddress();
            oStream.println(i + ": " + address + ".");
            String description = fac.getDescription();
            oStream.println(i + ": " + description + ".");
            int refNumber = fac.getRefNumber();
            oStream.println(i + ": " + refNumber + ".");
            int capacity = fac.getCapacity();
            oStream.println(i + ": " + capacity + ".");
            int cost = fac.getCost();
            oStream.println(i + ": " + cost + ".");
            int problemRate = fac.getProblemRate();
            oStream.println(i + ": " + problemRate + ".");
        }

        oStream.close();
        System.out.println("File has been saved.");
    }

    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        Facility fac = new Facility("Airlock #0", 0);
        wf.saveFacilityInfo(fac);
    }
}
