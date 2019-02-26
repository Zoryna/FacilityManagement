package marsmission.habcontrol;

import java.util.Map;
import java.util.HashMap;

public class FacilityMachines extends Facility {

    public Facility fac;

    public FacilityMachines(Facility fac){
        this.fac = fac;
    }

    public void readMachines(Facility fac){
        System.out.println("This is the " + fac.getName() + " facility.");
        fac.getFacilityStatus();
    }

    public static void main(String[] args){
        Facility apollo = new Facility();
        Facility nyx = new Facility();
        FacilityMachines fmApollo = new FacilityMachines(apollo);
        FacilityMachines fmNyx = new FacilityMachines(nyx);

        apollo.setName("Apollo");
        nyx.setName("Nyx");
        apollo.startMachines();
        nyx.startMachines();

        fmApollo.readMachines(apollo);
        System.out.println("\n");
        fmNyx.readMachines(nyx);
    }

}
