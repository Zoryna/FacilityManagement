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
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(true);
        apolloMach.nuclearReactor(false);
        apolloMach.comms(false);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        System.out.println("---------------------------");

        maint.setControl(c);
        c.shitIsBroken(apollo);
        ins.makeMaintenanceRequest();
        maint.setMach(apolloMach);
        maint.setInspection(ins);

        maint.listMaintenanceRequest(ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines())); //lists the broken machines needing to be fixed
        System.out.println("---------------------------");
        maint.fixFacility(); //changes facility state to resting
        apolloMach.update();
        maint.fixMachines(apolloMach.getMachines()); //have false machines turn true


        System.out.println("---------------------------");
        System.out.println("---------------------------");
        nyx.setName("Nyx");
        ins.setFacility(nyx);

        System.out.println("For Nyx");
        nyxMach.startMachines(); //all machines start as true
        nyxMach.getFacilityStatus(); //show status of all machines

        System.out.println("---------------------------");

        nyxMach.oxygenator(false);
        nyxMach.innerAirlocks(false);
        nyxMach.externalAirlocks(false);
        nyxMach.nuclearReactor(true);
        nyxMach.comms(true);
        nyxMach.waterMaking(true);

        nyxMach.update();
        nyxMach.getFacilityStatus();

        System.out.println("---------------------------");

        maint.setControl(c);
        c.shitIsBroken(nyx);
        ins.makeMaintenanceRequest();
        maint.setMach(nyxMach);
        maint.setInspection(ins);

        maint.listMaintenanceRequest(ins.returnBrokenMachines(nyxMach.getMap(), nyxMach.getMachines())); //lists the broken machines needing to be fixed
        System.out.println("---------------------------");
        maint.fixFacility(); //changes facility state to resting
        nyxMach.update();
        maint.fixMachines(nyxMach.getMachines()); //have false machines turn true




    }
}
