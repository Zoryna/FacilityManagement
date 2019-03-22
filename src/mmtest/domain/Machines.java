package mmtest.domain;

import java.util.Map;
import java.util.HashMap;

public class Machines extends MachinesInterface {

    private Facility fac;
    private boolean oxygenator, nuclearReactor, innerAirlocks, externalAirlocks,
            comms, waterMaking;
    private final int numberOfMachines = 6;
    private boolean[] machines = new boolean[numberOfMachines];
    private Map<String, Boolean> map = new HashMap<String, Boolean>();

    public Machines(Facility fac){
        this.fac = fac;
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

    public boolean[] getMachines(){
        machines[0] = oxygenator;
        machines[1] = nuclearReactor;
        machines[2] = innerAirlocks;
        machines[3] = externalAirlocks;
        machines[4] = comms;
        machines[5] = waterMaking;
        return machines;
    }

    // Set machines to false
    public void breakMachines(){
        oxygenator(false);
        nuclearReactor(false);
        innerAirlocks(false);
        externalAirlocks(false);
        comms(false);
        waterMaking(false);

        map.clear();
        initializeMap(map);
    }

    public void initializeMap(Map<String, Boolean> map){
        this.map.put("Oxygenator", oxygenator);
        this.map.put("Nuclear Reactor", nuclearReactor);
        this.map.put("Inner Airlocks", innerAirlocks);
        this.map.put("External Airlocks", externalAirlocks);
        this.map.put("Comms", comms);
        this.map.put("WaterMaking", waterMaking);
    }

    public void readMachines(){
        System.out.println("This is the " + fac.getName() + " facility.");
        getFacilityStatus();
    }

    public void startMachines(){
        // Set all of the booleans from this Facility to true;
        // This booleans are what we call "the machines from the Facility"
        oxygenator(true);
        nuclearReactor(true);
        innerAirlocks(true);
        externalAirlocks(true);
        comms(true);
        waterMaking(true);

        map.clear();
        initializeMap(map);
    }

    public void update(){
        machines[0] = oxygenator;
        machines[1] = nuclearReactor;
        machines[2] = innerAirlocks;
        machines[3] = externalAirlocks;
        machines[4] = comms;
        machines[5] = waterMaking;
        map.clear();
        initializeMap(map);
    }

    public Map<String, Boolean> getMap(){
        return map;
    }

    public void getFacilityStatus(){ // The status of the map in this object
        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }

    public void getFacilityStatus(Map<String, Boolean> map){ // The status of any Facility map
        for (Map.Entry<String, Boolean> i: map.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
