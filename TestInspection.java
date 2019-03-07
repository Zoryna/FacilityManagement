public class TestInspection
{
    public static void main (String[] args)
    {
        Facility apollo = new Facility();
        Facility nyx = new Facility();

        Machines apolloMachines = new Machines(apollo);
        Machines nyxMachines = new Machines(nyx);

        Inspection in = new Inspection();
        Control c = new Control();

        apollo.setName("Apollo");
        in.setFacility(apollo);
        apolloMachines.startMachines();
        apolloMachines.getFacilityStatus();
        apolloMachines.update();
        apolloMachines.readMachines();
        apolloMachines.oxygenator(false);
        apolloMachines.update();
        apolloMachines.getFacilityStatus();

        for (int i = 0; i < apolloMachines.getMachines().length; i++){
            System.out.println(i + ": " + apolloMachines.getMachines()[i]);
        }
    }
}
