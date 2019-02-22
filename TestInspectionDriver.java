/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {
        StateMachine sm = new StateMachine();
        Inspection ins = new Inspection();
        Control c = new Control();
        FacilityMachines fac0 = new FacilityMachines();

        fac0.setName("Airlocks #1");
        System.out.println("This is system: " + fac0.getName());
        System.out.println("The current state is: " + fac0.getState()); //at resting state

        //3 not working
        fac0.Oxygenator(false);
        fac0.InnerAirlocks(true);
        fac0.ExternalAirlocks(false);
        fac0.NuclearReactor(true);
        fac0.Comms(true);
        fac0.WaterMaking(false);


        if ((fac0.checkMachines(fac0.getMap())) > 0) //if at least 1 is not working
        {
            sm.setStateBroken(fac0);
            if(ins.isBroken(fac0) == true)
            {
                ins.makeMaintenanceRequest(fac0, 1);
                System.out.println("Listing the faciility issues: ");
                ins.listFacilityIssues(fac0, 1);
            }
        }
        else
            c.assignToUse(fac0);
    }
}