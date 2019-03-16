import marsmission.domain.*;
import marsmission.dataaccess.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

        // Staging Objects
        Facility apollo = new Facility();
        Facility nyx = new Facility();
        Facility erebos = new Facility();
        Facility athena = new Facility();
        Facility artemis = new Facility();
        Facility[] fac = new Facility[5];
        Machines[] ar = new Machines[5];
        apollo.setName("Apollo");
        nyx.setName("Nyx");
        erebos.setName("Erebos");
        athena.setName("Athena");
        artemis.setName("Artemis");
        Machines apolloM = new Machines(apollo);
        Machines nyxM = new Machines(nyx);
        Machines erebosM = new Machines(erebos);
        Machines athenaM = new Machines(athena);
        Machines artemisM = new Machines(artemis);
        fac[0] = apollo;
        fac[1] = nyx;
        fac[2] = erebos;
        fac[3] = athena;
        fac[4] = artemis;
        ar[0] = apolloM;
        ar[1] = nyxM;
        ar[2] = erebosM;
        ar[3] = athenaM;
        ar[4] = artemisM;

        // Staging Time of the Day
        TimeController tc = new TimeController();
        tc.setHours(7);

        // Checking what the Facilities are doing at 7 am
        System.out.println("This is the state of affairs at 7 am:");
        for (int i = 0; i < ar.length; i++){
            System.out.println(fac[i].getName() + " is " + fac[i].getState());
        }

        // Moving time of the day by one hour
        System.out.print("\n");
        System.out.println("Time is now 8 am.");
        tc.setHours(8);

        // We are going to need to control this now
        Control c = new Control();
        Inspection in = new Inspection();

        for (int i = 0; i < ar.length; i++){
            c.assignToUse(fac[i]);
            ar[i].startMachines();
            System.out.println(fac[i].getName() + " is " + fac[i].getState());
            ar[i].getFacilityStatus();
            System.out.print("\n");
        }

        // Let's start another day, and now let's break something
        System.out.print("\n");
        System.out.println("Time is now 8 pm.");
        tc.setHours(8);
        for (int i = 0; i < ar.length; i++){
            c.assignToUse(fac[i]);
            ar[i].startMachines();
            System.out.println(fac[i].getName() + " is " + fac[i].getState());
            ar[i].getFacilityStatus();
            System.out.print("\n");
        }

        // Let's break Erebos and move the hours a little up
        erebosM.breakMachines();
        in.setFacility(erebosM);
        System.out.println("Erebos just broke. How many machines are broken in Erebos?" + " " + in.checkMachines(erebosM.getMap()) + " machines are broken. Oh noes, how sad. Cry me a river.");
        System.out.println("\n");


        // Since Erebos is broken let's use Control to take over its state

        /*
            Technically, we wanted this to be automated, without the involvement of the user,
            since Inspection was actually intendend as an Observer.
            We might implement this for Phase 2.
        */

        tc.setHours(9);
        c.shitIsBroken(erebos);
        System.out.println("This is the state of affairs at " + tc.getHours() + " am.");
        for (int i = 0; i < ar.length; i++){
            System.out.println(fac[i].getName() + " is " + fac[i].getState());
        }

        // Now let's fix Erebos up, first, it needs maintenance
        in.makeMaintenanceRequest();
        System.out.println("\n");
        System.out.println("Erebos is at: " + erebos.getState());

        // Time to use Maintenance
        Maintenance m = new Maintenance();
        m.setInspection(in);
        m.setControl(c);
        Finance fin = new Finance();
        fin.setMaintHourlyCost(50); //cost of maintenance per hour

        m.listMaintenanceRequest(in.returnBrokenMachines(erebosM.getMap(), erebosM.getMachines()));
        System.out.println("\n");
        fin.calcMaintCostFacility(5, 2); //calculates the cost of maintenance
        m.fixMachines(erebosM.getMap());
        fin.setRatePerHour(3.05); //cost of watt per hour
        fin.calcDowntimeFacility(2); //calculates how long the facility has been broken

        // Time to set baby Erebos back
        System.out.println("\n");
        m.fixFacility();
        fin.calcUsage(in.checkMachines(erebosM.getMap()), 4); //calculates cost of using facility

        // Finally, let's put it back to work

        /* If it's under working hours, and no machines are broken, go to work, baby */
        if (tc.getHours() > 8 && tc.getHours() < 18 && in.checkMachines(erebosM.getMap()) == 0){
            c.assignToUse(erebos);
        }

        // Final check
        for (int i = 0; i < ar.length; i++){
            c.assignToUse(fac[i]);
            ar[i].startMachines();
            System.out.println(fac[i].getName() + " is " + fac[i].getState());
            ar[i].getFacilityStatus();
            System.out.print("\n");
        }

        //testing Management
        System.out.println("Let's pick Erebos for management");
        Management ma = new Management();

        ma.actualUsage(in.checkMachines(erebosM.getMap())); //actual percentage of use
        ma.requestAvailableCapacity(in.checkMachines(erebosM.getMap())); //the remaining percentage of the facility
        ma.problemRateFacility(3, 2); ////percentage of the tests that failed
    }
}
