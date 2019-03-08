public class TestMaintenance
{
    public static void main (String args[])
    {
        Facility apollo = new Facility();
        Machines apolloMach = new Machines(apollo);

        Inspection ins = new Inspection();
        Control c = new Control();

        apollo.setName("Apollo");
        ins.setFacility(apollo);

        apolloMach.startMachines(); //all machines start as true
        apolloMach.getFacilityStatus(); //show status of all machines

        apolloMach.oxygenator(false);
        apolloMach.innerAirlocks(false);
        apolloMach.externalAirlocks(false);
        apolloMach.nuclearReactor(false);
        apolloMach.comms(false);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        //should only show broken machines
        System.out.println("Here are the broken machines");
        ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines());

        //testing the requests
        c.shitIsBroken(apollo);
        if(ins.makeMaintenanceRequest(1) > 0)
        {
            System.out.println("This facility will go through maintenance");
        }
        else
            System.out.println("This facility will not go through maintenance");












    }
}
