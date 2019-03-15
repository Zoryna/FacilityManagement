import marsmission.domain.*;
import marsmission.dataaccess.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

        ApplictionContext context = new ClassPathXmlApplicationCOntext("app-context.xml");








        // Staging Objects
        Facility apollo = new Facility();
        Facility nyx = new Facility();
        Facility erebos = new Facility();
        Facility athena = new Facility();
        Facility artemis = new Facility();

        //giving each Facility their machines
        Machines apolloMach = new Machines(apollo);
        Machines nyxMach = new Machines(nyx);
        Machines erebosMach = new Machines(erebos);
        Machines athenaMach = new Machines(athena);
        Machines artemisMach = new Machines(artemis);

        apolloMach.setName("Apollo");
        nyxMach.setName("Nyx");
        erebosMach.setName("Erebos");
        athenaMach.setName("Athena");
        artemisMach.setName("Artemis");

        Machines[] ar = new Machines[5];
        ar[0] = apolloMach;
        ar[1] = nyxMach;
        ar[2] = erebosMach;
        ar[3] = athenaMach;
        ar[4] = artemisMach;

        // Staging Time of the Day
        TimeController tc = new TimeController();
        tc.setHours(7);

        // Checking what the Facilities are doing at 7 am
        System.out.println("This is the state of affairs at 7 am:");
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
        }

        // Moving time of the day by one hour
        System.out.print("\n");
        System.out.println("Time is now 8 am.");
        tc.setHours(8);

        // We are going to need to control this now
        Control c = new Control();
        Inspection in = new Inspection();

        for (int i = 0; i < ar.length; i++){
            c.assignToUse(ar[i]);
            ar[i].startMachines();
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
            ar[i].getFacilityStatus();
            System.out.print("\n");
        }

        // Let's go for a day where everything worked just fine.
        // Let's call FacilityBehavior to go about our day

        /*FacilityBehavior fb = new FacilityBehavior();

        System.out.println("Time is now 7 pm.");
        tc.setHours(19);
        for (int i = 0; i < ar.length; i++){
            fb.setFacilityBehavior(ar[i]);
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
        } */

        // Let's start another day, and now let's break something
        System.out.print("\n");
        System.out.println("Time is now 8 pm.");
        tc.setHours(8);
        for (int i = 0; i < ar.length; i++){
            c.assignToUse(ar[i]);
            ar[i].startMachines();
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
            ar[i].getFacilityStatus();
            System.out.print("\n");
        }

        // Let's break Erebos and move the hours a little up
        erebosMach.breakMachines();
        in.setFacility(erebosMach);
        System.out.println("Erebos just broke. How many machines are broken in Erebos?" + " " + in.checkMachines(ar[2].getMap()) + " machines are broken. Oh noes, how sad. Cry me a river.");
        System.out.println("\n");


        // Since Erebos is broken let's use Control to take over its state

        /*
            Technically, we wanted this to be automated, without the involvement of the user,
            since Inspection was actually intendend as an Observer.
            We might implement this for Phase 2.
        */

        tc.setHours(9);
        c.shitIsBroken(erebosMach);
        System.out.println("This is the state of affairs at " + tc.getHours() + " am.");
        for (int i = 0; i < ar.length; i++){
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
        }

        // Now let's fix Erebos up, first, it needs maintenance
        in.makeMaintenanceRequest();
        System.out.println("\n");
        System.out.println("Erebos is at: " + erebosMach.getState());

        // Time to use Maintenance
        Maintenance m = new Maintenance();
        m.setInspection(in);
        m.setControl(c);
        Finance fin = new Finance();
        fin.setMaintHourlyCost(50); //cost of maintenance per hour

        m.listMaintenanceRequest(in.returnBrokenMachines(erebosMach.getMap(), erebosMach.getMachines()));
        System.out.println("\n");
        fin.calcMaintCostFacility(5, 2); //calculates the cost of maintenance
        m.fixMachines(erebosMach.getMap());
        fin.setRatePerHour(3.05); //cost of watt per hour
        fin.calcDowntimeFacility(2); //calculates how long the facility has been broken

        // Time to set baby Erebos back
        System.out.println("\n");
        m.fixFacility();
        fin.calcUsage(in.checkMachines(erebosMach.getMap()), 4); //calculates cost of using facility

        // Finally, let's put it back to work

        /* If it's under working hours, and no machines are broken, go to work, baby */
        if (tc.getHours() > 8 && tc.getHours() < 18 && in.checkMachines(erebosMach.getMap()) == 0){
            c.assignToUse(erebos);
        }

        // Final check
        for (int i = 0; i < ar.length; i++){
            c.assignToUse(ar[i]);
            ar[i].startMachines();
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
            ar[i].getFacilityStatus();
            System.out.print("\n");
        }

        //testing Management
        System.out.println("Let's pick Erebos for management");
        Management ma = new Management();

        ma.actualUsage(in.checkMachines(erebosMach.getMap())); //actual percentage of use
        ma.requestAvailableCapacity(in.checkMachines(erebosMach.getMap())); //the remaining percentage of the facility
        ma.problemRateFacility(3, 2); ////percentage of the tests that failed

    }
}
