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
        System.out.println("This is facility: " + apollo.getName());
        ins.setFacility(apollo); //so inspection knows which facility to inspect

        apolloMach.startMachines(); //all machines start as true
        apolloMach.getFacilityStatus(); //show status of all machines

        apolloMach.oxygenator(false);
        apolloMach.innerAirlocks(false);
        apolloMach.externalAirlocks(false);
        apolloMach.nuclearReactor(false);
        apolloMach.comms(false);
        apolloMach.waterMaking(false);

        apolloMach.update();
        apolloMach.getFacilityStatus();

        //should only show broken machines
        /*System.out.println("Here are the broken machines");
        ins.returnBrokenMachines(apolloMach.getMap(), apolloMach.getMachines());

        if (ins.checkMachines(apolloMach.getMap()) > 1)
        {
            System.out.println("At least one of the machines is broken");
        }
        else
            System.out.println("None of the machines are broken"); */


        c.shitIsBroken(apollo);
        /*if(ins.isBroken() == true)
        {
            System.out.println("The facility is broken");
        }
        else
            System.out.println("The system is not broken"); */

        if(ins.makeMaintenanceRequest(1) > 0)
        {
            System.out.println("This facility will go through maintenance");
        }
        else
            System.out.println("This facility will not go through maintenance");


        nyx.setName("Nyx");
        System.out.println("This is facility: " + nyx.getName());
        ins.setFacility(nyx); //so inspection knows which facility to inspect

        nyxMach.update();

        nyxMach.startMachines(); //all machines start as true
        nyxMach.getFacilityStatus(); //show status of all machines

        nyxMach.oxygenator(true);
        nyxMach.innerAirlocks(true);
        nyxMach.externalAirlocks(true);
        nyxMach.nuclearReactor(true);
        nyxMach.comms(true);
        nyxMach.waterMaking(true);

        nyxMach.update(); //updates machines so it's not all true anymore
        nyxMach.getFacilityStatus();

        //should only show broken machines
        /*System.out.println("Here are the broken machines");
        ins.returnBrokenMachines(nyxMach.getMap(), nyxMach.getMachines());

        if (ins.checkMachines(nyxMach.getMap()) > 1)
        {
            System.out.println("At least one of the machines is broken");
        }
        else
            System.out.println("None of the machines are broken"); */


        c.assignToUse(nyx);
        /*if(ins.isBroken() == true)
        {
            System.out.println("The facility is broken");
        }
        else
            System.out.println("The system is not broken"); */

        if(ins.makeMaintenanceRequest(1) > 0)
        {
            System.out.println("This facility will go through maintenance");
        }
        else
            System.out.println("This facility will not go through maintenance");
    }
}
