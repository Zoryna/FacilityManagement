import java.io.*;
import java.util.*;

public class TestWriteFile {
    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        StateMachine sm = new StateMachine();
        Facility fac = new Facility("Airlock #0", 0);
        FacilityMachines fm = new FacilityMachines();

        // Staging Object to be saved
        fm.setDescription("TOBEEEE FLYYYY HIIIIIGH");
        fm.setAddress("Acidalia Planitia");
        fm.setCapacity(1000);
        fm.setCost(2.71);
        fm.setProblemRate(2/100);
        System.out.println(fm.getDescription());
        fm.startMachines();
        sm.setStateWorking(fac);

        // Reading up WriteFile to write file
        wf.setFileName("FacilitySaved.txt");
        wf.saveFacilityInfo(fac); // Check this
    }
}
