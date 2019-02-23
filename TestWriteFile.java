import java.io.*;
import java.util.*;

public class TestWriteFile {
    public static void main(String[] args){
        WriteFile wf = new WriteFile();
        FacilityMachines fac = new FacilityMachines();
        PrintWriter outputStream = null;

        // Staging Object to be saved
        fac.setName("Airlocks #0");
        fac.setRefNumber(0);
        fac.setDescription("Test");
        fac.startMachines();

        // Reading up WriteFile to write file
        wf.setFileName("FacilitySaved.txt");
        wf.saveFacilityInfo(fac);
    }
}
