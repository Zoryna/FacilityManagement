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
        Maintenance maint = new Maintenance(); //lists maintenance/what needs to be done

        FacilityMachines fac0 = new FacilityMachines();
        FacilityMachines fac1 = new FacilityMachines();
        FacilityMachines fac2 = new FacilityMachines();


        //fac 0
        fac0.setName("Airlocks #1");
        fac0.setRefNumber(0);
        System.out.println("This is system: " + fac0.getName());
        System.out.println("The current state is: " + fac0.getState()); //at resting state


        //breaking the machines in the facilities

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
            System.out.println(r.getRandom() + " Oxygenator is working");
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
            System.out.println(r.getRandom() + "InnerAirlocks is working");
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
            System.out.println(r.getRandom() + "ExternalAirlocks is working");
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
            System.out.println(r.getRandom() + "NuclearReactor is working");
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
            System.out.println(r.getRandom() + "Comms is working");
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
            System.out.println(r.getRandom() + "WaterMaking is working");
            fac0.WaterMaking(true);
        }


        //changes the state of the facility if at least one machine is broken

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

        //making the maintenance request becuase of broken machines
        System.out.println("Testing Inspection");

        if (fac0.checkMachines(fac0.getMap()) > 0) //has broken machines
        {
            ins.isBroken(fac0); //check to see if it's broken

            System.out.println("The next function is listFacilityIssues");
            ins.listFacilityIssues(fac0 ,1);
            System.out.println("The end of listFacilityIssues");

            ins.makeMaintenanceRequest(fac0, 1);
            System.out.println("The state is: " + fac0.getState());

        }
        else
            System.out.println("This facility is working :)");

        //checking the maintenance/what needs to be fixed
        /*System.out.println("Testing maintenance");
        maint.listMaintenanceRequest(fac0, ins, 1);
        maint.listMaintenance(fac0, ins, 1); */
















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