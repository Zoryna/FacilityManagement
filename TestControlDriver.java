/*
    test driver for Control
 */

public class TestControlDriver
{
    public static void main (String[] args)
    {

        StateMachine stateMach = new StateMachine();
        Facility fac0 = new Facility ("Airlocks #0", 0);
        Facility fac1 = new Facility ("Airlocks #1", 1);
        Facility fac2 = new Facility ("Airlocks #2", 2);


        //testing assigning states
        //facility 0


        System.out.println("Initial state of fac 0: " + fac0.getFacilityState());
        System.out.println("Assign to use: " + stateMach.assignToUse(fac0)); //fix
        System.out.println("Current state of fac 0: " + fac0.getFacilityState());








        //facility 1


        //.getFacilityState();




        //facility 2


        //fac2.getFacilityState();






















    }
}