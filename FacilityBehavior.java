public abstract class FacilityBehavior implements FacilityAI {

    TimeController tc = new TimeController();
    Control c = new Control();
    private static final int START = 8;
    private static final int REST = 18;
    private static Facility FAC;

    FacilityBehavior(Facility FAC){
        this.FAC = FAC;
    }

    private void AI() {
        if (tc.getHours() >= START) {
            c.assignToUse(FAC);
        }
        else if (tc.getHours() >= REST){
            c.vacateFacility(FAC);
        }
    }

    public Facility getFacility() {
        return FAC;
    }
}
