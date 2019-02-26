package marsmission.habcontrol;
import java.util.*;

public class Facility extends StateMachine implements SuperFacility {

    public String name, address, description;
    public int refNumber, capacity, problemRate;
    private double cost;
    private Map<String, Boolean> map = new HashMap<String, Boolean>();
    private boolean[] machines = new boolean[6];
    private boolean oxygenator, innerAirlocks, externalAirlocks,
    comms, nuclearReactor, waterMaking;
    private final int numberOfMachines = 6; // Number of Machines inside Facility

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setRefNumber(int refNumber){
        this.refNumber = refNumber;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void setProblemRate(int problemRate){
        this.problemRate = problemRate;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getDescription(){
        return description;
    }

    public int getRefNumber(){
        return refNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getCost(){
        return cost;
    }

    public int getProblemRate(){
        return problemRate;
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

    public void initializeMap(Map<String, Boolean> map){
        this.map.put("Oxygenator", oxygenator);
        this.map.put("Inner Airlocks", innerAirlocks);
        this.map.put("External Airlocks", externalAirlocks);
        this.map.put("Nuclear Reactor", nuclearReactor);
        this.map.put("Comms", comms);
        this.map.put("WaterMaking", waterMaking);
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
