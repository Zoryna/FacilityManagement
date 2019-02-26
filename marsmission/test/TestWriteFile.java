package marsmission.test;
import java.io.*;
import java.util.*;
import marsmission.habcontrol.Control;
import marsmission.dataaccess.WriteFile;
import marsmission.habcontrol.Facility;

public class TestWriteFile {
    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        Facility fm = new Facility();
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

        // Reading up WriteFile to write file
        wf.setFileName("Saved.txt"); // File is output on the root folder
        wf.saveFacilityInfo(fm); // Check this
    }
}
