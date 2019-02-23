public class TestMaintenanceDriver
{
    public static void main (String args[])
    {
        FacilityMachines fac0 = new FacilityMachines();
        Inspection ins = new Inspection();
        Maintenance maint = new Maintenance();

        fac0.setName("Airlocks #1");

        //3 not working
        fac0.Oxygenator(true);
        fac0.InnerAirlocks(false);
        fac0.ExternalAirlocks(true);
        fac0.NuclearReactor(false);
        fac0.Comms(true);
        fac0.WaterMaking(false);

        ins.makeMaintenanceRequest(fac0, 1);
        ins.listFacilityIssues(fac0, 1);

        maint.listMaintenanceRequest(fac0, ins, 1);
        System.out.println("Testing theBrokenMachines method");
        maint.fixMachines(fac0, fac0.theBrokenMachines(fac0.getMap()), ins, 1);







    }
}