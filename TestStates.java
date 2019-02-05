import java.util.*;

public class TestStates {
    public static void main(String[] args){
        StateMachine sm = new StateMachine();
        Facility fac00 = new Facility("Airlocks #0", 0);
        Facility fac01 = new Facility("Airlocks #1", 1);

        System.out.println("Starting Facility #0: " + fac00.getFacilityState());
        sm.toWorking(fac00);
        System.out.println("Putting #0 to use: " + fac00.getFacilityState());
        System.out.println("Checking if state conflicts with Facility #1: " + fac01.getFacilityState());
        sm.toMaintenance(fac00);
        System.out.println("Putting Facility #0 to Maintenance: " + fac00.getFacilityState());
        sm.toWorking(fac01);
        System.out.println("Putting Facility #1 to Work: " + fac01.getFacilityState());
        System.out.println("Facility #0 is: " + fac00.getFacilityState());
        System.out.println("Facility #1 is: " + fac01.getFacilityState());
    }
}
