package marsmission.domain;
import marsmission.domain.Facility;

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

        mApollo.readMachines();
        System.out.println("\n");
        mNyx.readMachines();
    }
}