import java.io.*;
import java.util.*;

public class TestWriteFile {
    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        // Facility fac = new Facility("Airlock #0", 0);
        FacilityMachines fm = new FacilityMachines();
        Control c = new Control();

        // Staging Object to be saved
        fm.setName("Airlock #0");
        fm.setRefNumber(0);
        fm.setDescription("TOBEEEE FLYYYY HIIIIIGH");
        fm.setAddress("Acidalia Planitia");
        fm.setCapacity(1000);
        fm.setCost(2.71);
        fm.setProblemRate(2);
        fm.startMachines();
        c.shitIsBroken(fm);
        System.out.println(fm.getState());

        // Reading up WriteFile to write file
        wf.setFileName("FacilitySaved.txt"); // File is outputed on the root folder
        wf.saveFacilityInfo(fm); // Check this
    }
}
