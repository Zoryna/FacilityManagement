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
        apolloMach.getFacilityStatus();

        System.out.println("---------------------------");

        c.shitIsBroken(apollo);
        ins.makeMaintenanceRequest();
        maint.setMach(apolloMach);
        maint.setInspection(ins);

        maint.listMaintenanceRequest(ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines())); //lists the broken machines needing to be fixed
        maint.fixFacility();



    }
}
