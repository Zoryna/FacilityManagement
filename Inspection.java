/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/

import java.util.*;
import java.util.ArrayList;

public class Inspection extends StateMachine
{
    public void listFacilityIssues(FacilityMachines fm, int reqNumber) //only contains what's broken
    {
        fm.theBrokenMachines(fm.getMap());
    }

    public boolean isBroken (FacilityMachines fm) //checks if the state is broken
    {
        if (fm.state == State.BROKEN)
        {
            System.out.println("This facility is BROKEN");
            return true;
        }
        else
            return false;
    }

    public String makeMaintenanceRequest (FacilityMachines fm, int reqNumber) //checks the state of the facility, then returns a String saying that there needs to be maintenance
    {
        String request = "Maintenance";

        if ((fm.state == State.BROKEN))
        {
            System.out.println("Needs maintenance");
            return request;
        }
        else
            return null;
    }

    /*public void listInspections()
    {
        /* Kind of the same thing, what could be done here is to call the dates of the
        inspections done and use the WriteFile (or w/e it's called) to save the inspections
         that have been done



    } */
}
