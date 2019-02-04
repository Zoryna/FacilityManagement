/*
    the Subject for the Observer pattern
 */


import java.util.List;

public class Facility extends StateMachine {

    private String name, address, description;
    private int refNumber, capacity, problemRate;
    private double cost;


    Facility(String name, int refNumber){
        this.name = name;
        this.refNumber = refNumber;
    }

    //state






    //list of Observers that notify the Observer
    private List<Inspection> observers = new ArrayList<Inspection>(); //Inspection is Observer class






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

    public Facility getFacilityObj(){
        Facility fac = new Facility(name, refNumber);
        return fac;
    }
}
