import marsmission.habcontrol.*;
import marsmission.dataaccess.*;
import marsmission.simulation.*;
import marsmission.management.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

        // Staging Objects
        Facility apollo = new Facility();
        Facility nyx = new Facility();
        Facility erebos = new Facility();
        Facility athena = new Facility();
        Facility artemis = new Facility();
        Facility[] ar = new Facility[5];
        apollo.setName("Apollo");
        nyx.setName("Nyx");
        erebos.setName("Erebos");
        athena.setName("Athena");
        artemis.setName("Artemis");
        ar[0] = apollo;
        ar[1] = nyx;
        ar[2] = erebos;
        ar[3] = athena;
        ar[4] = artemis;

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
        FacilityBehavior fb = new FacilityBehavior();
        System.out.println("Time is now 7 pm.");
        tc.setHours(19);
        for (int i = 0; i < ar.length; i++){
            fb.setFacilityBehavior(ar[i]);
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
        }

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
        erebos.breakMachines();
        System.out.println("How many machines are broken in Erebos?" + " " + in.checkMachines(ar[2].getMap()) + " machines are broken. Oh noes, how sad. Cry me a river.");
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
            System.out.println(ar[i].getName() + " is " + ar[i].getState());
        }

        // Now let's fix Erebos up, first, it needs maintenance
        in.makeMaintenanceRequest(erebos);
        System.out.println("\n");
        System.out.println("Erebos is at: " + erebos.getState());

        // Time to use Maintenance
        Maintenance m = new Maintenance();
        m.listMaintenanceRequest(erebos, in, erebos.getMachines());
        System.out.println("\n");
        m.fixMachines(erebos, erebos.getMap(), in);

        // Time to set baby Erebos back
        System.out.println("\n");
        m.fixFacility(erebos, c);

        // Finally, let's put it back to work

        /* If it's under working hours, and no machines are broken, go to work, baby */
        if (tc.getHours() > 8 && tc.getHours() < 18 && in.checkMachines(erebos.getMap()) == 0){
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

    }
}
