/*
  class that has the details of the facility
*/

public class Facility
{
    private String name, address, description;
    private int refNumber, capacity, cost, problemRate;

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.name = address;
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

    public void setCost(int cost){
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

    public int getCost(){
        return cost;
    }

    public int getProblemRate(){
        return problemRate;
    }

    public void addDetail() // What is this? Detail of what? Seems redundant
    {

    }

    public void getFacilityInfo() // Same thing, description should cover it
    {

    }

    public void requestAvailableCapacity() // This could be in Control, or in Management
    {

    }
}
