/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {

        Control c = new Control();
        Inspection ins = new Inspection();
        Maintenance maint = new Maintenance();

        Facility fac0 = new Facility ("Airlocks #0", 0);
        Facility fac1 = new Facility ("Airlocks #1", 1);
        Facility fac2 = new Facility ("Airlocks #2", 2);


        //fac 0
        System.out.println("This is system fac0");
        System.out.println("Current is: " + fac0.getState());
        c.assignToUse(fac0); //asigned to use, working
        System.out.println("State is now: " + fac0.getState());
        System.out.println("Testing if state is BROKEN: ");
        ins.testBroken(fac0);

        //fac 1
        System.out.println("This is system fac1");
        System.out.println("Current is: " + fac1.getState());
        c.scheduleMaintenance(fac1); //schedule maintenance, need maintenance
        System.out.println("State is now: " + fac1.getState());
        System.out.println("Testing if state is BROKEN: ");
        ins.testBroken(fac1);

        //fac 2
        System.out.println("This is system fac2");
        System.out.println("Current is: " + fac2.getState());
        c.vacateFacility(fac2); //vacate facility, resting facility
        System.out.println("State is now: " + fac2.getState());
        System.out.println("Testing if state is BROKEN: ");
        ins.testBroken(fac2);



        //testing maintenance
        System.out.println("Testing maintenance request:");

        //maintenance requests for fac0, which is currently WORKING state
        ins.makeMaintenanceRequest(fac0); //returns a Maintenance object
        ins.makeMaintenanceRequest(fac0); //returns a Maintenance object
        maint.listMaintenanceRequest(fac0, ins);





        //maintenance requsets for fac1, which is currently in MAINTENANCE state
        ins.makeMaintenanceRequest(fac1);
        maint.listMaintenanceRequest(fac1, ins);

        //maintenance requests for fac2, which is currently in RESTING state
        //ins.makeMaintenanceRequest(fac2);











    }
}