public class TestInspection
{
    public static void main (String[] args)
    {
        StateMachine sm = new StateMachine();
        Inspection ins = new Inspection();
        Control c = new Control();
        FacilityMachines fac0 = new FacilityMachines();

        fac0.setName("Airlocks #1");
        System.out.println("This is facility " + fac0.getName());
        System.out.println("The current state is: " + fac0.getState()); //at resting state

        fac0.oxygenator(true);
        fac0.innerAirlocks(false);
        fac0.externalAirlocks(true);
        fac0.nuclearReactor(false);
        fac0.comms(true);
        fac0.waterMaking(false);


        if ((fac0.checkMachines(fac0.getTheMap())) > 0) //if at least 1 is not working
        {
            sm.setStateBroken(fac0);
            if(ins.isBroken(fac0) == true)
            {
                ins.makeMaintenanceRequest(fac0, 1);
                System.out.println("Listing the faciility issues");
                ins.listFacilityIssues(fac0, 1);
            }
        }
        else
        {
            c.assignToUse(fac0);
            System.out.println("The state is: " + fac0.getState());
        }
    }
}
