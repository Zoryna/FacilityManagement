/*
    The control class has the goal to change the state of the facilities according
    to the rules of when they are WORKING, RESTING, or MAINTENANCE
*/

// Fetch the facility objects, and change their states using these three functions

public class Control
{
    int interval;
    StateMachine state;
    Facility facility;

    public boolean assignToUse(Facility facility, StateMachine state)
    {
        //This function changes the facility to State.WORKING

        this.facility = facility;
        this.state = state.toWorking(facility);

        if (facility.getFacilityState() == state.toWorking(facility))
        {
            return true;
            System.out.println("Assigned to working");
        }
        else
            return false;

    }

    public boolean vacateFacility(Facility facility, StateMachine state)
    {
        //Assign a facility to RESTING state

        this.facility = facility;
        this.state = state.toResting(facility);

        if (facility.getFacilityState() == state.toResting(facility))
        {
            return true;
            System.out.println("Assigned to resting");
        }
        else
            return false;

    }

    public boolean scheduleMaintenance(Facility facility, StateMachine state)
    {
        //Assign a facility to MAINTENANCE

        this.facility = facility;
        this.state = state.toMaintenance(facility);

        if (facility.getFacilityState() == state.toMaintenance(facility))
        {
            return true;
            System.out.println("Assigned to maintenance");
        }

        else
            return false;

    }
}
