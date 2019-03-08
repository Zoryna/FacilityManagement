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

        System.out.println("For Apollo");
        apolloMach.startMachines(); //all machines start as true
        apolloMach.getFacilityStatus(); //show status of all machines

        System.out.println("---------------------------");

        apolloMach.oxygenator(true);
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(true);
        apolloMach.nuclearReactor(false);
        apolloMach.comms(false);
        apolloMach.waterMaking(false);

        apolloMach.update();
        System.out.println("---------------------------");
        apolloMach.getFacilityStatus();

        //should only show broken machines
        System.out.println("Here are the broken machines");
        ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines());
        System.out.println("---------------------------");

        c.shitIsBroken(apollo);
        maint.setInspection(ins);

        ins.makeMaintenanceRequest();
        maint.listMaintenanceRequest(); //list the broken machines needing to be fixed
        maint.fixFacility(c);



    }
}
