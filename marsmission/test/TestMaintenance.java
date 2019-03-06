package marsmission.test;
import marsmission.domain.StateMachine;
import marsmission.domain.Inspection;
import marsmission.domain.Maintenance;
import marsmission.domain.Facility;
import marsmission.domain.Control;

public class TestMaintenance
{
    public static void main (String args[])
    {
        StateMachine sm = new StateMachine();
        Control c = new Control();
        Inspection i = new Inspection();
        Maintenance m = new Maintenance();
        Facility fac = new Facility();

        // Staging Object
        fac.setName("Galactica");
        fac.breakMachines();
        System.out.println(fac.getName() + " is: " +  fac.getState());

        // Starting day
        c.assignToUse(fac);
        System.out.println(fac.getName() + " is now: " + fac.getState());

        // Breaking Machines
        fac.breakMachines();
        System.out.println("# of broken machines: " + i.checkMachines(fac.getMap()));

        // Checking what's up
        System.out.println("List of the broken machines procede below:");
        m.listMaintenanceRequest(fac, i, fac.getMachines());

        // Fix machines
        System.out.println("Maintenance doing what it does, fixing stuff:");
        m.fixMachines(fac, fac.getMap(), i);

        // Are the machines fixed?
        System.out.println("# of broken machines: " + i.checkMachines(fac.getMap()));

        // What's the state of the Facility after this?
        System.out.println(fac.getName() + " is now: " +(fac.getState()));

    }
}
