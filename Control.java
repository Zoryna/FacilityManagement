/*
    The control class has the goal to change the state of the facilities according
    to the rules of when they are WORKING, RESTING, or MAINTENANCE
*/

// Fetch the facility objects, and change their states using these three functions

public class Control
{
    int interval;

    public boolean assignToUse()
    {
        // This function changes the facility to State.WORKING
    }

    public boolean vacateFacility()
    {
        // Assign a facility to RESTING state
    }

    public boolean scheduleMaintenance()
    {
        // Assign a facility to MAINTENANCE
    }
}
