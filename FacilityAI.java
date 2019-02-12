/*
    Since not all Facilities might behave the same in the future, instead of making
    just one AI to define behavior, this interface is being created as a future
    guide for it.
*/

public interface FacilityAI {
    public void decisionTree(); // How/When/Which decisions are made
    public void getFacility(Facility fac); // Select a Facility to apply this
    public Facility getFacility(); // Return the Facility
    
    /*  Decision Tree

        If it's >= 8 AM, then send it to Maintenance

        If Oxygenator OR innerAirlocks OR externalAirlocks == false
            State.Maintenance is needed

        If NuclearReactor OR waterMaking OR Comms == false && if it's >= 6pm
            State.Maintenance is needed

    */

}
