package marsmission.dataaccess;
import marsmission.domain.*;
import java.util.Map;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteFile implements WriteFileInterface{

    private String fileName;
    private Facility fac;
    private FacilityInformation fi;
    private Map<String, Boolean> map;
    private MachinesInterface m;
    PrintWriter oStream = null;


    public WriteFile(Facility fac, FacilityInformation fi, Map<String,Boolean> map){
        this.fi = fi;
        this.fac = fac;
        this.map = map;
    }

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

        /*
            This thing can probably be improved A LOT, but needs a total revamp,
            let's ignore how ugly this is for now? Please and thank you. But hey,
            this still complies to SRP. Silver lining. (ღ˘⌣˘ღ)
        */

        int i = 0;
        String name = fi.getName();
        oStream.println(i + ": " + name + ".");
        i++;
        int refNumber = fi.getRefNumber();
        oStream.println(i + ": " + refNumber + ".");
        i++;
        String address = fi.getAddress();
        oStream.println(i + ": " + address + ".");
        i++;
        String description = fi.getDescription();
        oStream.println(i + ": " + description + ".");
        i++;
        int capacity = fi.getCapacity();
        oStream.println(i + ": " + capacity + ".");
        i++;
        double cost = fi.getCost();
        oStream.println(i + ": " + cost + ".");
        i++;
        int problemRate = fi.getProblemRate();
        oStream.println(i + ": " + problemRate + ".");
        i++;

        switch(fac.getState()){
            case RESTING:
                String resting = "RESTING";
                oStream.println(i + ": " + "State - " + resting + ".");
            break;

            case BROKEN:
                String broken = "BROKEN";
                oStream.println(i + ": " + "State - " + broken + ".");
            break;

            case WORKING:
                String working = "WORKING";
                oStream.println(i + ": " + "State - " + working + ".");
            break;

            case MAINTENANCE:
                String maintenance = "MAINTENANCE";
                oStream.println(i + ": " + "State - " + maintenance + ".");
            break;
        }

        oStream.close();
        System.out.println("File has been saved.");
    }
}
