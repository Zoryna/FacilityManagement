import java.util.*;

public class TestStates {
    public static void main(String[] args){
        StateMachine sm = new StateMachine();
        System.out.println("Starting State: " + sm.getState());
        sm.toWorking();
        System.out.println("Putting it to use: " + sm.getState());
        sm.toMaintenance();
        System.out.println("At Maintenance: " + sm.getState());

    }
}
