package marsmission.habcontrol;

import java.util.*;

public class Inspection extends StateMachine {

    public void listFacilityIssues(Facility fac, boolean[] machines){

        returnBrokenMachines(fac.getMap(), machines);
    }

    public boolean isBroken(Facility fac){

        if (fac.state == State.BROKEN)
            return true;
        else
            return false;
    }

    public String makeMaintenanceRequest(Facility fac) {
        String request = "Needs maintenance";
        String nah = "Does not need maintenance";

        if (fac.state == State.BROKEN){
            System.out.println("Needs maintenance");
            return request;
        } else {
            return nah;
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

        if (map.get("Oxygenator") == false)
            newMap.put("Oxygenator", machines[0]);
        if (map.get("Inner Airlocks") == false)
            newMap.put("Inner Airlocks", machines[1]);
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
            System.out.println(i.getKey() + ": " + i.getValue());
        }
        return newMap;
    }
}
