/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/

public class Inspection extends StateMachine
{

    /*public void listFacilityIssues()
    {
        /* Our facilities just do one thing now, they do work or they do not, so at this moment,
         this isn't needed, unless you wanna assign facilities to a Queue when they have
         the MAINTENANCE state.






    } */

    public boolean makeMaintenanceRequest(Facility facility) //if return true then make request
    {
        /* Connect to Maintenance, obviously

            - You will need a Driver with many facilities with different states, just create a scenario of it
            - Write a Inspection function that checks the facility state, select the ones that are RESTING
            - return something that the Maintenance class can do with it
        */

        //int maintRequests = 0;

        if (facility.state != State.WORKING) //if the state is already WORKING then it doesn't need maintenance
        {
            maintRequests++;
            System.out.println("This facility needs maintenance");
            //System.out.println("The amount of maintenance requests: " + maintRequests);

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
