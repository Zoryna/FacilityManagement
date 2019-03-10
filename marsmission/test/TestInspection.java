package marsmission.test;
import marsmission.domain.Inspection;
import marsmission.domain.Control;
import marsmission.domain.Facility;
import marsmission.domain.StateMachine;

public class TestInspection
{
    public static void main (String[] args)
    {
        StateMachine sm = new StateMachine();
        Inspection ins = new Inspection();
        Control c = new Control();
        Facility fac = new Facility();

        fac.setName("Pegasus");
        System.out.println("This is the " + fac.getName() + " facility. The current state is " + fac.getState() + ".");


        // Testing with Machines put to work
        fac.startMachines();

        if ((ins.checkMachines(fac.getMap())) > 0) //if at least 1 is not working
        {
            c.shitIsBroken(fac);
            if(ins.isBroken(fac) == true)
            {
                ins.makeMaintenanceRequest(fac);
                System.out.println("Listing the facility issues");
                ins.listFacilityIssues(fac, fac.getMachines());
            }
        } else {
            c.assignToUse(fac);
            System.out.println("The state is: " + fac.getState());
        }

        fac.getFacilityStatus();

        // Testing with Machines put to broken
        fac.breakMachines();

        if ((ins.checkMachines(fac.getMap())) > 0) //if at least 1 is not working
        {
            c.shitIsBroken(fac);
            System.out.println("Facility " + fac.getName() + " is: " + fac.getState());
            if(ins.isBroken(fac) == true)
            {
                ins.makeMaintenanceRequest(fac);
                System.out.println("Listing the facility issues");
                ins.listFacilityIssues(fac, fac.getMachines());
                System.out.println("Facility " + fac.getName() + " is: " + fac.getState());
            }
        } else {
            c.assignToUse(fac);
            System.out.println("The state is: " + fac.getState());
        }

        // Since Facility is BROKEN, call Control to schedule a maintenance
        ins.makeMaintenanceRequest(fac);
        fac.getState();
    }
}
