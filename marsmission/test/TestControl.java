package marsmission.test;
import marsmission.domain.Control;
import marsmission.domain.Facility;

public class TestControl{
    public static void main(String[] args){
        Control c = new Control();
        Facility fac = new Facility();
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
