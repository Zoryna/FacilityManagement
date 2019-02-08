/*
    1. Check on what needs to be inspected, probably Facilities only
    2. Talks to the interested parties about what's going on (Is the Facility working? Is it at Maintenance? Is it resting? Should it be resting?)
*/

public class Inspection extends StateMachine
{

    Facility facility;

    /*public void listFacilityIssues()
    {
        /* Our facilities just do one thing now, they do work or they do not, so at this moment,
         this isn't needed, unless you wanna assign facilities to a Queue when they have
         the MAINTENANCE state.






    } */

    public Maintenance makeMaintenanceRequest (Facility facility) //checks the state of the facility, then returns a Maintenance object for tht facility
    {

        /* Connect to Maintenance, obviously

            - You will need a Driver with many facilities with different states, just create a scenario of it
            - Write a Inspection function that checks the facility state, select the ones that are RESTING
            - return something that the Maintenance class can do with it
        */

        this.facility = facility;
        Maintenance aMaintenance = new Maintenance(facility);

        if ((facility.state == State.RESTING) || (facility.state == State.WORKING) || (facility.state == State.MAINTENANCE))
        {
            System.out.println("This facility requests maintenance :(");

            //need to do more tests if the same facility actually makes new Maintenance objects
            //or if it successfully returns a Maintenance object
            return aMaintenance;
        }
        else
            return null;




    }

    public boolean testBroken (Facility facility) //if return true then make request
    {

        //int maintRequests = 0;

        if (facility.state != State.WORKING) //if the state is already WORKING then it doesn't need maintenance
        {
            //maintRequests++;
            System.out.println("This facility is BROKEN :(");
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
