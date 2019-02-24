import marsmission.habcontrol.*;
import marsmission.dataaccess.*;
import marsmission.simulation.*;
import marsmission.management.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

        // Staging Objects
        Facility apollo = new Facility("Apollo", 0);
        Facility nyx = new Facility("Nyx", 1);
        Facility erebos = new Facility("Erebos", 2);
        Facility athena = new Facility("Athena", 3);
        Facility artemis = new Facility("Artemis", 4);
        Facility[] ar = new Facility[5];
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

        // Putting all the machines facility to work
        FacilityMachines fm = FacilityMachines();
        for (int i = 0; i < ar.length; i++){
            // Show Machines for every facility
        }
    }
}
