package marsmission.domain;
import java.util.*;

public class Inspection implements InspectionInterface, Observer {

    private static Facility fac;
    private static MachinesInterface mach;
    private Maintenance m;

    //setters
    public void setFacility(Facility fac) { this.fac = fac; }

    public void setMachines(MachinesInterface mach) { this.mach = mach;}

    public void setMaintenance(Maintenance m){
        this.m = m;
    }

    //getters
    public Facility getFacility() {return fac;}

    public MachinesInterface getMachines() {return mach;}

    public boolean isBroken(){

        if (fac.getState().toString().equals("BROKEN"))
            return true;
        else
            return false;
    }

    public boolean makeMaintenanceRequest(){

        if (fac.getState().toString().equals("BROKEN")){
            System.out.println("This facility needs maintenance"); //for testing
            return true;
        }
        else {
            System.out.println("This facility does not need maintenance"); //for testing
            return false;
        }
    }

    public int checkMachines(ArrayList<MachinesInterface> machinesList){ //counts how many machines are broken

        int issues = 0;
        for (int i = 0; i < machinesList.size();i++) {
            if(machinesList.get(i).status() == false)
                issues++;
        }
        return issues;
    }

    public ArrayList returnBrokenMachines(ArrayList<MachinesInterface> machinesList){

        ArrayList<MachinesInterface> brokenMachines = new ArrayList<MachinesInterface>();

        for (int i = 0; i < machinesList.size(); i++) {
            if(machinesList.get(i).status() == false)
                brokenMachines.add(machinesList.get(i));
        }

        return brokenMachines;
    }

    /*public void update() {


    } */
}
