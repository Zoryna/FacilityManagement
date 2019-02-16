/*
    test driver for Inspection
 */

public class TestInspectionDriver
{
    public static void main (String[] args)
    {
        Randomizer r = new Randomizer(); //creates random instances of a machine breaking
        r.setRandom();
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

        //testing the facility machines, probably a better way to do this

        //Oxygenator
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " Oxygenator is broken");
            fac0.Oxygenator(false);
            c.scheduleMaintenance(fac0);
        }
        else
        {
            System.out.println(r.getRandom() + " All machines are functioning");
            fac0.Oxygenator(true);
        }


        //InnerAirlocks
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " InnerAirlocks is broken");
            fac0.InnerAirlocks(false);
            c.scheduleMaintenance(fac0);
        }
        else
        {
            System.out.println(r.getRandom() + " All machines are functioning");
            fac0.InnerAirlocks(true);
        }


        //ExternalAirlocks
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " ExternalAirlocks is broken");
            fac0.ExternalAirlocks(false);
            c.scheduleMaintenance(fac0);
        }
        else
        {
            System.out.println(r.getRandom() + " All machines are functioning");
            fac0.ExternalAirlocks(true);
        }


        //NuclearReactor
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " NuclearReactor is broken");
            fac0.NuclearReactor(false);
            c.scheduleMaintenance(fac0);
        }
        else
        {
            System.out.println(r.getRandom() + " All machines are functioning");
            fac0.NuclearReactor(true);
        }


        //Comms
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " Comms is broken");
            fac0.Comms(false);
            c.scheduleMaintenance(fac0);
        }
        else
        {
            System.out.println(r.getRandom() + " All machines are functioning");
            fac0.Comms(true);
        }



        //WaterMaking
        r.wingardiumLeviosa(fac0);
        if (r.wingardiumLeviosa(fac0) == false)
        {
            System.out.println(r.getRandom() + " WaterMaking is broken");
            fac0.WaterMaking(false);
            c.scheduleMaintenance(fac0);
        }
        else
        {
            System.out.println(r.getRandom() + " All machines are functioning");
            fac0.WaterMaking(true);
        }













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