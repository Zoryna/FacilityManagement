/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/

import java.util.*;
import java.util.ArrayList;

public class Inspection extends StateMachine
{

    public void listFacilityIssues(FacilityMachines fm, int reqNumber) //lists what is broken, similar to listMaintenance
    {
        fm.showBrokenMachines(fm.getMap()); //fix
    }

    public String makeMaintenanceRequest (FacilityMachines fm, int reqNumber) //checks the state of the facility, then returns a String saying that there needs to be maintenance
    {

        String request = "This facility needs maintenance";

        if ((fm.state == State.RESTING) || (fm.state == State.MAINTENANCE))
        {
            System.out.println("Needs maintenance");
            return request;
        }
        else
            return null;
    }

    //3 states: resting, maintenance (broken), working
    public boolean isBroken (FacilityMachines fm) //checks the state
    {

        if (fm.state != State.WORKING)
        {
            System.out.println("This facility is BROKEN :(");
            return true;
        }
        else
            return false;

    }

    /*public void listInspections()
    {
        /* Kind of the same thing, what could be done here is to call the dates of the
        inspections done and use the WriteFile (or w/e it's called) to save the inspections
         that have been done



    } */
}
