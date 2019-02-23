package marsmission.habcontrol;

import java.util.*;

public class FacilityMachines extends Facility {

    private boolean oxygenator, innerAirlocks, externalAirlocks,
    comms, nuclearReactor, waterMaking;
    private Map<String, Boolean> map = new HashMap<String, Boolean>();
    private final int numberOfMachines = 6;
    // Store a Hashmap with the keys as the variables, and return it.
    // Maybe extending the StateMachine is needed

    public FacilityMachines() {
        super(name, refNumber);
    }

    public void oxygenator(boolean oxygenator){
        this.oxygenator = oxygenator;
    }

    public void nuclearReactor(boolean nuclearReactor){
        this.nuclearReactor = nuclearReactor;
    }

    public void innerAirlocks(boolean innerAirlocks){
        this.innerAirlocks = innerAirlocks;
    }

    public void externalAirlocks(boolean externalAirlocks){
        this.externalAirlocks = externalAirlocks;
    }

    public void comms(boolean comms){
        this.comms = comms;
    }

    public void waterMaking(boolean waterMaking){
        this.waterMaking = waterMaking;
    }

    public void startMachines(){
        // Set machines to work
        oxygenator(true);
        nuclearReactor(true);
        innerAirlocks(true);
        externalAirlocks(true);
        comms(true);
        waterMaking(true);

        map.put("Oxygenator", oxygenator);
        map.put("Inner Airlocks", innerAirlocks);
        map.put("External Airlocks", externalAirlocks);
        map.put("Nuclear Reactor", nuclearReactor);
        map.put("Comms", comms);
        map.put("WaterMaking", waterMaking);
    }

    public Map<String, Boolean> getMap(){
        return map;
    }

    public Map<String, Boolean> getTheMap(){
        map.put("Oxygenator", oxygenator);
        map.put("Inner Airlocks", innerAirlocks);
        map.put("External Airlocks", externalAirlocks);
        map.put("Nuclear Reactor", nuclearReactor);
        map.put("Comms", comms);
        map.put("WaterMaking", waterMaking);

        return map;
    }

    public void getFacilityStatus(){
        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public void getFacilityStatus(Map theMap) //shows the status of each machine
    {
        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public int checkMachines(Map theMap) //counts the amount of broken machines
    {
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


        System.out.println("The amount of broken machines is: " + issues);
        return issues;
    }

    public Map theBrokenMachines(Map theMap) //takes broken machines and puts into new map and returns new map
    {
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
    }
}
