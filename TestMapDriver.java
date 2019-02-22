public class TestMapDriver
{
    public static void main (String[] args)
    {

        FacilityMachines fac0 = new FacilityMachines();

        fac0.Oxygenator(false);
        fac0.InnerAirlocks(true);
        fac0.ExternalAirlocks(false);
        fac0.NuclearReactor(true);
        fac0.Comms(true);
        fac0.WaterMaking(false);

        //fac0.getMap();
        fac0.getFacilityStatus(fac0.getMap());

        System.out.println(" ");
        System.out.println("Show amount broken: ");
        fac0.checkMachines(fac0.getMap());

























    }
}