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

        /*
        apolloMachines.getFacilityStatus();
        apolloMachines.oxygenator(false);
        System.out.println(apolloMachines.getOxygenator()); */



        /*if ((ins.checkMachines(mach0.getMap())) > 0) //if at least 1 is not working
        {
            System.out.println("At least one of the machines is broken");
        }
        else
        {
            System.out.println("All the machines are working");
        }

        sm.setStateBroken(fac0);
        if (ins.isBroken() == true)
            System.out.println("This facility is broken");
        else
            System.out.println("This facility is not broken");
      */










    }
}
