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

        for (int i = 0; i < ar.length; i++){
            // Show Machines for every facility
        }
    }
}
