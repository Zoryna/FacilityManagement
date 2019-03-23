package mmtest.domain;
import mmtest.domain.Facility;

public class TestMachines {
    public static void main(String[] args){
        Facility apollo = new Facility();
        Facility nyx = new Facility();
        Machines mApollo = new Machines(apollo);
        Machines mNyx = new Machines(nyx);

        apollo.setName("Apollo");
        nyx.setName("Nyx");
        mApollo.startMachines();
        mNyx.startMachines();

        //mApollo.readMachines();
        System.out.println("\n");
        //mNyx.readMachines();

        System.out.println("\n");
        System.out.println("Facility Status test.");

        mApollo.getFacilityStatus();
        System.out.println("\n");
        mNyx.getFacilityStatus();

        mApollo.breakMachines();
        mNyx.breakMachines();

        System.out.println("\n");
        System.out.println("Facility Status test.");

        mApollo.getFacilityStatus();
        System.out.println("\n");
        mNyx.getFacilityStatus();
    }
}
