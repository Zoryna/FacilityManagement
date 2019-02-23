package marsmission.test;
import marsmission.habcontrol.Control;
import marsmission.habcontrol.Facility;

public class TestControl{
    public static void main(String[] args){
        Control c = new Control();
        Facility fac = new Facility("Airlock #0", 0);
        System.out.println(fac.getState());
        c.assignToUse(fac);
        System.out.println(fac.getState());
        c.scheduleMaintenance(fac);
        System.out.println(fac.getState());
        c.vacateFacility(fac);
        System.out.println(fac.getState());
        c.shitIsBroken(fac);
        System.out.println(fac.getState());
    }
}
