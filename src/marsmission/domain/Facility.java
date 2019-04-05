package marsmission.domain;

import java.util.*;

public class Facility extends StateMachine implements FacilityInterface, Subject {

    private String name, address, description;
    private int refNumber, capacity, problemRate;
    private Oxygenator o;
    private NuclearReactor n;
    private InnerAirlocks inn;
    private ExternalAirlocks ex;
    private Comms com;
    private WaterExtraction w;
    private double cost;
    private Observer obs;
    private ArrayList<Observer> observerList;

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

    public void setNuclearReactor(NuclearReactor n) {this.n = n;}

    public void setInnerAirlocks(InnerAirlocks inn) {this.inn = inn;}

    public void setExternalAirlocks(ExternalAirlocks ex) {this.ex = ex;}

    public void setComms(Comms com) {this.com = com;}

    public void setWaterExtraction(WaterExtraction w) {this.w = w;}

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

    public Oxygenator getOxygenator(){ return o; }

    public NuclearReactor getNuclearReactor() {return n;}

    public InnerAirlocks getInnerAirlocks() {return inn;}

    public ExternalAirlocks getExternalAirlocks() {return ex;}

    public Comms getComms() {return com;}

    public WaterExtraction getWaterExtraction() {return w;}

    //gets reference to Observer
    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    public void removeObserver(Observer obs) {
        for (int i = 0; i < observerList.size(); i++) {
            if (observerList.get(i).equals(obs))
                observerList.remove(obs);
        }
    }

    /*public void notifyObservers() {


    } */
}

