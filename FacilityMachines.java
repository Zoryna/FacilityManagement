import java.util.*;

public class FacilityMachines extends Facility {

    public boolean oxygenator, innerAirlocks, externalAirlocks,
    comms, nuclearReactor, waterMaking;
    private Map<String, Boolean> map = new HashMap<String, Boolean>();
    private final int numberOfMachines = 6;
    // Store a Hashmap with the keys as the variables, and return it.
    // Maybe extending the StateMachine is needed

    FacilityMachines() {
        super(name, refNumber);
    }

    public boolean Oxygenator(boolean oxygenator){
        return this.oxygenator = oxygenator;
    }

    public boolean InnerAirlocks(boolean innerAirlocks){
        return this.innerAirlocks = innerAirlocks;
    }

    public boolean ExternalAirlocks(boolean externalAirlocks){
        return this.externalAirlocks = externalAirlocks;
    }

    public boolean NuclearReactor(boolean nuclearReactor){
        return this.nuclearReactor = nuclearReactor;
    }

    public boolean Comms(boolean comms){
        return this.comms = comms;
    }

    public boolean WaterMaking(boolean waterMaking){
        return this.waterMaking = waterMaking;
    }


    public Map getMap(){
        map.put("Oxygenator", oxygenator);
        map.put("Inner Airlocks", innerAirlocks);
        map.put("External Airlocks", externalAirlocks);
        map.put("Nuclear Reactor", nuclearReactor);
        map.put("Comms", comms);
        map.put("WaterMaking", waterMaking);

        return map;
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


        System.out.println("The amount of issues is: " + issues);
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
