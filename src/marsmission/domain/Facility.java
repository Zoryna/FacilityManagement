package marsmission.domain;

import java.util.*;

public class Facility extends StateMachine implements FacilityInterface {

    private String name, address, description;
    private int refNumber, capacity, problemRate;
    private Oxygenator o;
    private InnerAirlocks i;
    private ExternalAirlocks e;
    private NuclearReactor n;
    private Comms c;
    private WaterExtraction w;
    private double cost;

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

    public void setOxygenator(Oxygenator o){ this.o = o; }

    public void setInnerAirlocks(InnerAirlocks i) { this.i = i; }

    public void setExternalAirlocks(ExternalAirlocks e) { this.e = e; }

    public void setNuclearReactor(NuclearReactor n) { this.n = n; }

    public void setComms(Comms c) { this.c = c; }

    public void setWaterExtraction(WaterExtraction w) { this.w = w; }

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

    public State getState() {
        return state;
    }

    public Oxygenator getOxygenator() { return o; }

    public InnerAirlocks getInnerAirlocks() { return i; }

    public ExternalAirlocks getExternalAirlocks() { return e; }

    public NuclearReactor getNuclearReactor() { return n; }

    public Comms getComms() { return c; }

    public WaterExtraction getWaterExtraction() { return w; }
}
