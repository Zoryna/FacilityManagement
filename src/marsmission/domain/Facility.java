package marsmission.domain;
import java.util.*;

/* The Subject */

public class Facility extends StateMachine implements FacilityInterface {

    private String name, address, description;
    private int refNumber, capacity, problemRate;
    private double cost;
    private ArrayList<Inspection> observerList;
    private Inspection ins;

    Facility() {}

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

    public State getState() {
        return state;
    }

    //Observer
    public void addObserver(Inspection ins) {
        observerList.add(ins);
    }

    public void removeObserver(Inspection ins) {
        observerList.remove(ins);
    }

    public void notifyObservers(){ //updates


    }







}