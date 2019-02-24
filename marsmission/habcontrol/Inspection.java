/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/
package marsmission.habcontrol;

import java.util.*;

public class Inspection extends StateMachine{

    public void listFacilityIssues(Facility fac){ //only shows what's broken

        // fac.returnBrokenMachines(fac.getMap());
    }

    public boolean isBroken(Facility fac){ //checks if the state is broken

        if (fac.state == State.BROKEN)
            return true;
        else
            return false;
    }

    public String makeMaintenanceRequest(Facility fac) {//checks the state of the facility, then returns a String saying that there needs to be maintenance

        String request = "Needs maintenance";
        String nah = "Does not need maintenance";

        if (fac.state == State.BROKEN){
            System.out.println("Needs maintenance");
            return request;
        } else {
            return nah;
        }
    }

    public int checkMachines(Map<String, Boolean> map){ //counts the amount of broken machines

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

    /*
    public Map returnBrokenMachines(Map<String, Boolean> map){ //takes broken machines and puts into new map and returns new map

        Map<String, Boolean> newMap = new HashMap<String, Boolean>();

        if (map.get("Oxygenator") == false)
            newMap.put("Oxygenator", oxygenator);

        if (map.get("Inner Airlocks") == false)
            newMap.put("Inner Airlocks", innerAirlocks);

        if (map.get("External Airlocks") == false)
            newMap.put("External Airlocks", externalAirlocks);

        if (map.get("Nuclear Reactor") == false)
            newMap.put("Nuclear Reactor", nuclearReactor);

        if (map.get("Comms") == false)
            newMap.put("Comms", comms);

        if (map.get("WaterMaking") == false)
            newMap.put("WaterMaking", waterMaking);

        //for testing
        for (Map.Entry<String, Boolean> i : newMap.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
        return newMap;
    } */
}
