public class TestMaintenanceDriver
{
    public static void main (String args[])
    {
        StateMachine sm = new StateMachine();
        Control c = new Control();
        Inspection ins = new Inspection();
        Maintenance maint = new Maintenance();
        FacilityMachines fac0 = new FacilityMachines();

        fac0.setName("Airlocks #1");
        System.out.println("This is facility " + fac0.getName());
        System.out.println("The current state is: " + fac0.getState()); //at resting state

        fac0.Oxygenator(true);
        fac0.InnerAirlocks(true);
        fac0.ExternalAirlocks(true);
        fac0.NuclearReactor(false);
        fac0.Comms(false);
        fac0.WaterMaking(false);


        if ((fac0.checkMachines(fac0.getMap())) > 0) //if at least 1 is not working
        {
            sm.setStateBroken(fac0);
            if(ins.isBroken(fac0) == true)
            {
                ins.makeMaintenanceRequest(fac0, 1);
                System.out.println("Listing the faciility issues");
                ins.listFacilityIssues(fac0, 1);
                System.out.println("Listing the request");
                maint.listMaintenanceRequest(fac0, ins, 1);
            }
        }
        else
        {
            c.assignToUse(fac0);
            System.out.println("The state is: " + fac0.getState());
        }


        //testing methods that fix the machines
        System.out.println("Testing if the machines are fixed");
        if ((fac0.checkMachines(fac0.getMap())) > 0) //if at least one machine is broken
        {
            System.out.println("Fixing these broken machines: ");
            maint.fixMachines(fac0, fac0.theBrokenMachines(fac0.getMap()), ins, 1);
            System.out.println("Changing the state");
            maint.fixedTheFacility(fac0, c); //changes the state brom broken to resting
        }
        else
        {
            c.assignToUse(fac0);
            System.out.println("The state is: " + fac0.getState());
        }









    }
}