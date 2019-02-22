/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/

import java.util.*;
import java.util.ArrayList;

public class Inspection extends StateMachine
{

    public void listFacilityIssues(FacilityMachines fm) //lists what is broken
    {
        //fm.getFacilityStatus(fm.getMap());
        fm.showBrokenMachines(fm.getMap());
    }

    public String makeMaintenanceRequest (FacilityMachines fm, int reqNumber) //checks the state of the facility, then returns a String saying that there needs to be maintenance
    {
        /* Connect to Maintenance, obviously

            - You will need a Driver with many facilities with different states, just create a scenario of it
            - Write a Inspection function that checks the facility state, select the ones that are RESTING
            - return something that the Maintenance class can do with it
        */

        String request = "This facility needs maintenance";

        /*if (numIssues > 0)
            return request;
        else
            return null; */

        if ((fm.state == State.RESTING) || (fm.state == State.MAINTENANCE))
        {
            System.out.println("Needs maintenance");
            return request;
        }
        else
            return null;
    }

    //3 states: resting, maintenance, working
    public boolean isBroken (FacilityMachines fm) //checks the state
    {
        /*if (numIssues > 0)
        {
            System.out.println("This facility is BROKEN :(");
            return true;
        }

        else
            return false; */

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
