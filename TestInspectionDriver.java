/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {

        Control c = new Control(); //assigns availability
        Inspection ins = new Inspection(); //checks if facilities are working/if need maintenance
        Maintenance maint = new Maintenance(); //lists maintenance, changes state to resting

        //Facility fac0 = new Facility ("Airlocks #0", 0);
        //Facility fac1 = new Facility ("Airlocks #1", 1);
        //Facility fac2 = new Facility ("Airlocks #2", 2);

        FacilityMachines fac0 = new FacilityMachines();
        FacilityMachines fac1 = new FacilityMachines();
        FacilityMachines fac2 = new FacilityMachines();


        //fac 0
        /*System.out.println("This is system fac0");
        c.assignToUse(fac0); //asigned to use, working
        System.out.println("State is: " + fac0.getState());

        ins.makeMaintenanceRequest(fac0, 1); //request 1
        ins.makeMaintenanceRequest(fac0, 2);
        maint.listMaintenanceRequest(fac0, ins, 1);
        maint.listMaintenanceRequest(fac0, ins, 2);
        maint.fixedTheFacility(fac0, c); */

        //fac 1
        System.out.println("This is system fac1");
        c.scheduleMaintenance(fac1); //schedule maintenance, need maintenance
        System.out.println("State is: " + fac1.getState());

        ins.makeMaintenanceRequest(fac1, 1);
        maint.listMaintenanceRequest(fac1, ins, 1);
        maint.fixedTheFacility(fac1, c); //this should change to resting

        //fac 2
        /*System.out.println("This is system fac2");
        c.vacateFacility(fac2); //vacate facility, resting facility
        System.out.println("State is: " + fac2.getState());

        ins.makeMaintenanceRequest(fac2, 1);
        maint.listMaintenanceRequest(fac2, ins, 1);
        maint.fixedTheFacility(fac2, c);
        */


    }
}