package marsmission.domain;

public class FacilityBehavior extends StateMachine implements FacilityAI {

    TimeController tc = new TimeController();
    Control c = new Control();
    // Inspection i = new Inspection();
    private int START = tc.getHours();
    private int REST = tc.getHours();
    public Facility fac;

    public void setFacilityBehavior(Facility fac){
        this.fac = fac;
        AI();
    }

    public void AI(){
        tc.setHours(START);
        if (tc.getHours() >= START && tc.getHours() < REST && fac.getState() != State.BROKEN){
            c.assignToUse(fac);
        }
        else if (tc.getHours() >= REST){
            c.vacateFacility(fac);
        }
    }

    // To comply with the interface, later it should go out, it has no business here
    public Facility getFacility(){
        return fac;
    }
}
