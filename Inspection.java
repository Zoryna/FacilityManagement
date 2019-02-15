/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/

import java.util.ArrayList;

public class Inspection extends StateMachine
{

    public boolean checkMachines(FacilityMachines fm) //if at least one is broken, change state to broken
    {

        if (map.containsValue(false))
        {
            System.out.println("One of the machines are broken");
            return false; //returns this when at least 1 is broken, which means facility needs maintenance
        }
        else
            return true; //when all 7 machines are working
    }

    public void listFacilityIssues(FacilityMachines fm, int reqNumber)
    {
        /* Our facilities just do one thing now, they do work or they do not, so at this moment,
         this isn't needed, unless you wanna assign facilities to a Queue when they have
         the MAINTENANCE state.
        */

        //list what is not working in the facility

        fm.getFacilityStatus();



    }

    public String makeMaintenanceRequest (FacilityMachines fm, int reqNum) //checks the state of the facility, then returns a String saying that there needs to be maintenance
    {
        /* Connect to Maintenance, obviously

            - You will need a Driver with many facilities with different states, just create a scenario of it
            - Write a Inspection function that checks the facility state, select the ones that are RESTING
            - return something that the Maintenance class can do with it
        */

        String request = "This facility needs maintenance";

        if ((fm.state == State.RESTING) || (fm.state == State.MAINTENANCE))
        {
            return request;
        }
        else
            return null;
    }

    //3 states: resting, maintenance, working
    public boolean isBroken (FacilityMachines fm)
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
