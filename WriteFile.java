import java.io.PrintWriter;
import java.io.FileNotFoundException;

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

    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        Facility fac = new Facility("Airlock #0", 0);
        fac.setAddress("Acidalia Planitia");
        fac.setDescription("Controls airlock #0");
        fac.setCapacity(1000);
        fac.setCost(6.73);
        fac.setProblemRate(2);
        wf.saveFacilityInfo(fac);
    }
}
