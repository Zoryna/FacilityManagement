public class Facility
{
    private String name, address, description;
    private int refNumber, capacity, cost, problemRate;

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

    public void getFacilityInfo(){
        /*
            This function could return an object Facility with ALL the variables
            of the object. Right now, the object is created empty (that is, no
            variables are parsed into the function when it is created, so it can't).
            We can change how the object is created, but for that we need a decision
            making in what variables are important, since making a function with six
            variables from the get go is probably a bad idea.
        */

        System.out.println("Name: " + name + ".");
        System.out.println("Address: " + address + ".");
        System.out.println("Description: " + description + ".");
        System.out.println("RefNumber: " + refNumber + ".");
        System.out.println("Capacity: " + capacity + ".");
        System.out.println("Cost: " + cost + ".");
        System.out.println("Problem Rate: " + problemRate + ".");
    }

    public void requestAvailableCapacity() // This could be in Control, or in Management
    {

    }
}
