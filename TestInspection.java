public class TestInspection
{
    public static void main (String[] args)
    {
        Facility apollo = new Facility();
        Facility nyx = new Facility();

        Machines apolloMach = new Machines(apollo);
        Machines nyxMach = new Machines(nyx);

        Inspection ins = new Inspection();
        Control c = new Control();

        apollo.setName("Apollo");
        ins.setFacility(apollo); //so inspection knows which facility to inspect

        apolloMach.startMachines(); //all machines start as true
        apolloMach.getFacilityStatus(); //show status of all machines

        apolloMach.oxygenator(false);
        apolloMach.innerAirlocks(true);
        apolloMach.externalAirlocks(false);
        apolloMach.nuclearReactor(false);
        apolloMach.comms(true);
        apolloMach.waterMaking(false);

        apolloMach.update(); //updates machines so it's not all true anymore
        apolloMach.getFacilityStatus();

        //should only show broken machines
        System.out.println("Here are the broken machines");
        ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines());

        /*if (ins.checkMachines(apolloMach.getMap()) > 1)
        {
            System.out.println("At least one of the machines is broken");
        }
        else
            System.out.println("None of the machines are broken");


        c.shitIsBroken(apollo);
        if(ins.isBroken() == true)
        {
            System.out.println("The facility is broken");
        }
        else
            System.out.println("The system is not broken"); */
    }
}
