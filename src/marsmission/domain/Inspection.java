package marsmission.domain;
import java.util.*;

public class Inspection implements InspectionInterface {

    private static Facility fac;
    private static Machines mach;
    private Maintenance m;

    //setters
    public void setFacility(Facility fac) { this.fac = fac; }

    public void setMachines(Machines mach) { this.mach = mach;}

    public void setMaintenance(Maintenance m){
        this.m = m;
    }

    //getters
    public Facility getFacility() {return fac;}

    public Machines getMachines() {return mach;}

    public Maintenance getMaintenance(){
        return m;
    }

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

    public int checkMachines(Map<String, Boolean> map){

        int issues = 0;
        if(map.get("Oxygenator") == false)
            issues++;
        if(map.get("Nuclear Reactor") == false)
            issues++;
        if(map.get("Inner Airlocks") == false)
            issues++;
        if(map.get("External Airlocks") == false)
            issues++;
        if(map.get("Comms") == false)
            issues++;
        if(map.get("WaterMaking") == false)
            issues++;
        return issues;
    }

    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map, boolean[] machines){

        Map<String, Boolean> newMap = new HashMap<String, Boolean>();

        //state of machines put into an array
        if (map.get("Oxygenator") == false)
            newMap.put("Oxygenator", machines[0]);
        if (map.get("Nuclear Reactor") == false)
            newMap.put("Nuclear Reactor", machines[1]);
        if (map.get("Inner Airlocks") == false)
            newMap.put("Inner Airlocks", machines[2]);
        if (map.get("External Airlocks") == false)
            newMap.put("External Airlocks", machines[3]);
        if (map.get("Comms") == false)
            newMap.put("Comms", machines[4]);
        if (map.get("WaterMaking") == false)
            newMap.put("WaterMaking", machines[5]);

        //for testing
        for (Map.Entry<String, Boolean> i : newMap.entrySet()) {
            System.out.println(i.getKey());
        }

        return newMap;
    }
}
