public class TestMaintenance
{
    public static void main (String args[])
    {
        Facility apollo = new Facility();
        Machines apolloMach = new Machines(apollo);

        Facility nyx = new Facility();
        Machines nyxMach = new Machines(nyx);

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
        apolloMach.nuclearReactor(false);
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(true);
        apolloMach.comms(false);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        System.out.println("---------------------------");

        c.shitIsBroken(apollo);
        ins.makeMaintenanceRequest();
        maint.setInspection(ins);

        maint.listMaintenanceRequest(ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines())); //lists the broken machines needing to be fixed
        System.out.println("---------------------------");
        apolloMach.update();
        maint.fixMachines(apolloMach.getMap()); //have false machines turn true
        maint.fixFacility(); //changes facility state to resting


        System.out.println("---------------------------");
        System.out.println("---------------------------");
        nyx.setName("Nyx");
        ins.setFacility(nyx);

        System.out.println("For Nyx");
        nyxMach.startMachines(); //all machines start as true
        nyxMach.getFacilityStatus(); //show status of all machines

        System.out.println("---------------------------");

        nyxMach.oxygenator(false);
        nyxMach.nuclearReactor(true);
        nyxMach.innerAirlocks(false);
        nyxMach.externalAirlocks(false);
        nyxMach.comms(true);
        nyxMach.waterMaking(true);

        nyxMach.update();
        nyxMach.getFacilityStatus();

        System.out.println("---------------------------");

        c.shitIsBroken(nyx);
        ins.makeMaintenanceRequest();
        maint.setInspection(ins);

        maint.listMaintenanceRequest(ins.returnBrokenMachines(nyxMach.getMap(), nyxMach.getMachines())); //lists the broken machines needing to be fixed
        System.out.println("---------------------------");
        nyxMach.update();
        maint.fixMachines(nyxMach.getMap()); //have false machines turn true
        maint.fixFacility(); //changes facility state to resting
    }
}
