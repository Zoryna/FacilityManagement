public class TestInspection
{
    public static void main (String[] args)
    {
        Facility fac0 = new Facility();
        Facility fac1 = new Facility();

        Machines mach0 = new Machines(fac0);
        Machines mach1 = new Machines(fac1);

        Inspection ins = new Inspection();

        ins.setFacility(fac0);
        fac0.setName("Fac0");
        System.out.println("This is facility " + fac0.getName() + " and the Inspection's facility is " + ins.getFacility());
        System.out.println("The current state is: " + fac0.getState()); //at resting state

        mach0.oxygenator(true);
        mach0.innerAirlocks(false);
        mach0.externalAirlocks(true);
        mach0.nuclearReactor(false);
        mach0.comms(true);
        mach0.waterMaking(false);


        if ((ins.checkMachines(mach0.getMap())) > 0) //if at least 1 is not working
        {
            System.out.println("At least one of the machines is broken");
        }
        else
        {
            System.out.println("All the machines are working");
        }


    }
}
