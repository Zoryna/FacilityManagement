/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {

        Control c = new Control();
        Inspection ins = new Inspection();
        StateMachine sm = new StateMachine();

        Facility fac0 = new Facility ("Airlocks #0", 0);
        Facility fac1 = new Facility ("Airlocks #1", 1);
        Facility fac2 = new Facility ("Airlocks #2", 2);

        //fac 0
        System.out.println("This is system fac0");
        System.out.println("Current is: " + fac0.getState());
        c.assignToUse(fac0); //asigned to use, working
        System.out.println("State is now: " + fac0.getState());
        System.out.println("Testing maintenance request, returns true if not at working state: ");
        ins.makeMaintenanceRequest(fac0);

        //fac 1
        System.out.println("This is system fac1");
        System.out.println("Current is: " + fac1.getState());
        c.scheduleMaintenance(fac1); //schedule maintenance, need maintenance
        System.out.println("State is now: " + fac1.getState());
        System.out.println("Testing maintenance request, returns true if not at working state: ");
        ins.makeMaintenanceRequest(fac1);

        //fac 2
        System.out.println("This is system fac2");
        System.out.println("Current is: " + fac2.getState());
        c.vacateFacility(fac2); //vacate facility, resting facility
        System.out.println("State is now: " + fac2.getState());
        System.out.println("Testing maintenance request, returns true if not at working state: ");
        ins.makeMaintenanceRequest(fac2);













    }
}