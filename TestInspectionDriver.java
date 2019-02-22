/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {
        Randomizer r = new Randomizer(); //creates random instances of a machine breaking
        Control c = new Control(); //assigns availability
        Inspection ins = new Inspection(); //checks if facilities are working/if need maintenance
        Maintenance maint = new Maintenance(); //lists maintenance, changes state to resting

        FacilityMachines fac0 = new FacilityMachines();
        FacilityMachines fac1 = new FacilityMachines();
        FacilityMachines fac2 = new FacilityMachines();


        //fac 0
        fac0.setName("Airlocks #1");
        fac0.setRefNumber(0);
        System.out.println("This is system: " + fac0.getName());
        System.out.println("The current state is: " + fac0.getState()); //at resting state

        //testing the facility machines and randomizer

        //Oxygenator
        r.setRandom();
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " Oxygenator is broken");
            fac0.Oxygenator(false);
        }
        else
        {
            System.out.println("Oxygenator is working");
            fac0.Oxygenator(true);
        }


        //InnerAirlocks
        r.setRandom();
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " InnerAirlocks is broken");
            fac0.InnerAirlocks(false);
        }
        else
        {
            System.out.println("InnerAirlocks is working");
            fac0.InnerAirlocks(true);
        }


        //ExternalAirlocks
        r.setRandom();
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " ExternalAirlocks is broken");
            fac0.ExternalAirlocks(false);
        }
        else
        {
            System.out.println("ExternalAirlocks is working");
            fac0.ExternalAirlocks(true);
        }


        //NuclearReactor
        r.setRandom();
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " NuclearReactor is broken");
            fac0.NuclearReactor(false);
        }
        else
        {
            System.out.println("NuclearReactor is working");
            fac0.NuclearReactor(true);
        }


        //Comms
        r.setRandom();
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " Comms is broken");
            fac0.Comms(false);
        }
        else
        {
            System.out.println("Comms is working");
            fac0.Comms(true);
        }


        //WaterMaking
        r.setRandom();
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " WaterMaking is broken");
            fac0.WaterMaking(false);
        }
        else
        {
            System.out.println("WaterMaking is working");
            fac0.WaterMaking(true);
        }



        if (fac0.getMap().containsValue(false))
        {
            System.out.println("Some of the machines aren't working");
            c.scheduleMaintenance(fac0);
            System.out.println("The state is: " + fac0.getState());
        }
        else
        {
            System.out.println("All the machines are working");
            c.assignToUse(fac0);
            System.out.println("The state is: " + fac0.getState());
        }

        System.out.println("Testing Inspection");

        if (fac0.checkMachines(fac0.getMap()) > 0) //has broken machines
        {
            ins.isBroken(fac0); //check to see if it's broken
            ins.listFacilityIssues(fac0);
            ins.makeMaintenanceRequest(fac0, 1);
            System.out.println("The state is: " + fac0.getState());

        }
        else
            System.out.println("This facility is working :)");


        System.out.println("Testing maintenance");
        maint.listMaintenanceRequest(fac0, ins, 1);
        maint.listMaintenance(fac0, ins, 1);
















        /*
        c.assignToUse(fac0); //asigned to use, working
        System.out.println("State is: " + fac0.getState());

        ins.makeMaintenanceRequest(fac0, 1); //request 1
        ins.makeMaintenanceRequest(fac0, 2);
        maint.listMaintenanceRequest(fac0, ins, 1);
        maint.listMaintenanceRequest(fac0, ins, 2);
        maint.fixedTheFacility(fac0, c); */














    }
}