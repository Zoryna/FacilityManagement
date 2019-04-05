package marsmission.domain;

public class WaterExtraction implements MachinesInterface {
    private Facility fac;
    private boolean status;
    private final String machine = "Water Extraction";

    public void setFacility(Facility fac) { this.fac = fac; }

    public Facility getFacility() { return fac; }

    public void machine(){
        System.out.println(machine);
    }

    public void setStatus(boolean s){
        this.status = s;
    }

    public boolean status(){
        return status;
    }

    public String getMachine(){
        return machine;
    }
}
