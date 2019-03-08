public class TestMachines
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
        apolloMachines.startMachines(); //sets map values to true
        apolloMachines.getFacilityStatus(); //prints the status of the map (should all be true)
        apolloMachines.oxygenator(false);
        apolloMachines.update(); //updates the map and array
        apolloMachines.getFacilityStatus();

        /*for (int i = 0; i < apolloMachines.getMachines().length; i++){
            System.out.println(i + ": " + apolloMachines.getMachines()[i]);
        } */
    }
}
