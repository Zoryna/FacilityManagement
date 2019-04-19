package marsmission.domain;

public class StateMaintenance extends StateMachine {
    public void scheduleMaintenance(Facility fac){ setStateMaintenance(fac); }
}
