public class FacilityBehavior implements FacilityAI {

    TimeController tc = new TimeController();
    Control c = new Control();
    private final int START = 8;
    private final int REST = 18;
    private static Facility fac;

    public void setFacilityBehavior(Facility fac){
        this.fac = fac;
    }

    public void AI() {
        tc.setHours(START);
        if (tc.getHours() >= START && tc.getHours() < REST) {
            c.assignToUse(fac);
        }
        else if (tc.getHours() >= REST) {
            c.vacateFacility(fac);
        }
    }

    @Override
    public Facility getFacility() {
        return fac;
    }
}
