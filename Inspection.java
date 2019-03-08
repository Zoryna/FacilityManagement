import java.util.*;

public class Inspection {

    private Facility fac;
    private Machines mach;

    //setters
    public void setFacility(Facility fac) { this.fac = fac; }

    public void setMachines(Machines mach) { this.mach = mach;}

    //getters
    public Facility getFacility() {return fac;}

    public Machines getMachines() {return mach;}

    public boolean isBroken(){

        if (fac.getState().toString().equals("BROKEN"))
            return true;
        else
            return false;
    }

    public int makeMaintenanceRequest(int reqNum){
        //has request number so can call number and
        //could be later associated with the broken machines in a specific inspection

        if (fac.getState().toString().equals("BROKEN")){
            System.out.println("This is maintenance request number " + reqNum);
            return reqNum;
        }

        else
        {
            System.out.println("This facility does not need maintenance");
            return 0;
        }

    }

    public int checkMachines(Map<String, Boolean> map){

        int issues = 0;
        if(map.get("Oxygenator") == false)
            issues++;
        if(map.get("Inner Airlocks") == false)
            issues++;
        if(map.get("External Airlocks") == false)
            issues++;
        if(map.get("Nuclear Reactor") == false)
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
            newMap.put("Oxygenator", machines[1]);
        if (map.get("Inner Airlocks") == false)
            newMap.put("Inner Airlocks", machines[0]);
        if (map.get("External Airlocks") == false)
            newMap.put("External Airlocks", machines[2]);
        if (map.get("Nuclear Reactor") == false)
            newMap.put("Nuclear Reactor", machines[3]);
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
