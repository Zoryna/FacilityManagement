package marsmission.test;
import java.io.*;
import java.util.*;
import marsmission.domain.Control;
import marsmission.dataaccess.WriteFile;
import marsmission.domain.Facility;

public class TestWriteFile {
    public static void main(String[] args){
        Facility fac = new Facility();
        WriteFile wf = new WriteFile(fac, fac.getMap());
        Control c = new Control();

        // Staging Object to be saved
        fac.setName("Airlock #0");
        fac.setRefNumber(0);
        fac.setDescription("TOBEEEE FLYYYY HIIIIIGH Ase to chi to namida de hikaru tsubasa de  ima zenbu  zenbu okizatte");
        fac.setAddress("Acidalia Planitia");
        fac.setCapacity(1000);
        fac.setCost(2.71);
        fac.setProblemRate(2);
        fac.startMachines();
        c.shitIsBroken(fac);

        // Reading up WriteFile to write file
        wf.setFileName("Saved.txt"); // File is output on the root folder
        wf.saveFacilityInfo(fac); // Check this
    }
}