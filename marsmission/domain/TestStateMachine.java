package marsmission.domain;

public class TestStateMachine {
    public static void main(String[] args){
        StateMachine sm = new StateMachine();
        Facility fac00 = new Facility();

        System.out.println("Test initial state: " + fac00.getState());
        sm.setStateWorking(fac00);
        System.out.println("Test changing to Work: " + fac00.getState());
        sm.setStateMaintenance(fac00);
        System.out.println("Test changing to Maintenance: " + fac00.getState());
        sm.setStateBroken(fac00);
        System.out.println("Test changing to Broken: " + fac00.getState());
    }
}
