public class TestMaintenance
{
    public static void main (String args[])
    {
        Facility apollo = new Facility();
        Machines apolloMach = new Machines(apollo);

        Inspection ins = new Inspection();
        Maintenance maint = new Maintenance();
        Control c = new Control();

        apollo.setName("Apollo");
        ins.setFacility(apollo);

        System.out.println("For Request 1");
        apolloMach.startMachines(); //all machines start as true
        apolloMach.getFacilityStatus(); //show status of all machines

        apolloMach.oxygenator(true);
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(true);
        apolloMach.nuclearReactor(false);
        apolloMach.comms(false);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        //should only show broken machines
        System.out.println("Here are the broken machines");
        ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines());

        c.shitIsBroken(apollo);
        maint.setFacility(apollo);

        ins.makeMaintenanceRequest(1);
        maint.listMaintenanceRequest(ins.makeMaintenanceRequest(1)); //list the broken machines needing to be fixed
        maint.fixFacility(c);


        /*System.out.println("For Request 2");
        apolloMach.startMachines(); //all machines start as true
        apolloMach.getFacilityStatus(); //show status of all machines

        apolloMach.oxygenator(false);
        apolloMach.innerAirlocks(false);
        apolloMach.externalAirlocks(false);
        apolloMach.nuclearReactor(true);
        apolloMach.comms(true);
        apolloMach.waterMaking(true);

        apolloMach.update();
        apolloMach.getFacilityStatus(); */



    }
}
