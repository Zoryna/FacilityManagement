package marsmission.domain;

public class Machines implements MachinesInterface {

    private Facility fac;
    private boolean status;
    public void setFacility(Facility fac) { this.fac = fac; }

    public Facility getFacility() { return fac; }

    public void machine(){
        System.out.println("Oxygenator");
    }

    public boolean status(){
        return status;
    }













}
