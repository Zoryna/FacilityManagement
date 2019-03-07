public class TestInspection
{
    public static void main (String[] args)
    {
        Facility fac0 = new Facility();
        Facility fac1 = new Facility();

        Machines mach0 = new Machines(fac0);
        Machines mach1 = new Machines(fac1);

        Inspection ins = new Inspection();
        StateMachine sm = new StateMachine();

        fac0.setName("Fac0");
        ins.setFacility(fac0);
        System.out.println("This is facility:  " + fac0 + " and the name is " + fac0.getName() + " and the Inspection's facility is " + ins.getFacility()); //check if they have the same facilityy
        System.out.println("The current state is: " + fac0.getState()); //at resting state

        mach0.startMachines();

        System.out.println("Changing some machines to false");
        mach0.oxygenator(true);
        mach0.innerAirlocks(false); //fix
        mach0.externalAirlocks(true); //fix
        mach0.nuclearReactor(false); //fix
        mach0.comms(false);
        mach0.waterMaking(false);

        mach0.initializeMap(mach0.getMap());
        //mach0.readMachines();

        System.out.println("Show status again through getFacilityStatus");
        mach0.getFacilityStatus(mach0.getMap()); //testing


        System.out.println("Show which machines are not working");
        ins.returnBrokenMachines(mach0.getMap(), mach0.getMachines()); //fix
        System.out.println("Testing when putting listFacilites after");

        ins.listFacilityIssues(mach0.getMap(), mach0.getMachines());


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
