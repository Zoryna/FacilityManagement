package marsmission.domain;

public class FacilityInformation extends Facility implements FacilityInterface {
    private String name, address, description;
    private int refNumber, capacity, problemRate;
    private double cost;
    private Facility f;

    public void setFacility(Facility f){ this.f = f; }

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
}