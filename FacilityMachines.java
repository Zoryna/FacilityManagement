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


    public Map getMap() //just returns the map
    {
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

    public void showBrokenMachines(Map theMap) //shows what is broken
    {
        for (Map.Entry<String, Boolean> i: map.entrySet())
        {
            if (map.containsValue(false)) //print out machines that are broken
                System.out.println(i.getKey() + " needs to be fixed"); //fix this
        }
    }

    public int checkMachines(Map theMap) //counts the amount of broken machines
    {
        int issues = 0;

        for (Map.Entry<String, Boolean> i: map.entrySet()){
            if (map.containsValue(false)) //fix this
            {
                issues++;
            }
        }
        System.out.println("The amount of issues are: " + issues);

        return issues;
    }
}