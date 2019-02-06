/*
    The control class has the goal to change the state of the facilities according
    to the rules of when they are WORKING, RESTING, or MAINTENANCE
*/

// Fetch the facility objects, and change their states using these three functions

public class Control
{
    int interval;
    StateMachine sm;
    State state;
    Facility facility; //all faciltiies start at RESTING


    public boolean assignToUse(Facility facility)
    {
        //This function changes the facility to State.WORKING (they're functioning)

        this.facility = facility;
        sm.toWorking(facility);

        System.out.println("The state of the facility is: " + facility.getFacilityState());




        /*if (facility.getFacilityState() == state.toWorking(facility)) //comparing state with state, if current state is working
        {
            return true;
            System.out.println("Assigned to working");
        }
        else
            return false;
        */

        return true; //testing
    }

    /*public boolean vacateFacility(Facility facility)
    {
        //Assign a facility to RESTING state

        this.facility = facility;
        this.sm = sm;





        if (facility.getFacilityState() == state.toResting(facility)) //comparing state with state, if current state is resting
        {
            return true;
            System.out.println("Assigned to resting");
        }
        else
            return false;


    }

    public boolean scheduleMaintenance(Facility facility)
    {
        //Assign a facility to MAINTENANCE (they need maintenanc)

        this.facility = facility;
        this.sm = sm;





        if (facility.getFacilityState() == state.toMaintenance(facility)) //comparing state with state, if current state needs maintenance
        {
            return true;
            System.out.println("Assigned to maintenance");
        }

        else
            return false;



    } */
}
