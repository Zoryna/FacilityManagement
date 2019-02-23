import marsmission.habcontrol.*;
import marsmission.dataaccess.*;
import marsmission.simulation.*;
import marsmission.management.*;

public class Driver {
    public static void main(String[] args){
        Facility fac0 = new Facility("", 0);
        Facility fac1 = new Facility("", 1);
        Facility fac2 = new Facility("", 2);
        Facility fac3 = new Facility("", 3);
        Facility fac4 = new Facility("", 4);
        StateMachine sm = new StateMachine();
        Control c = new Control();
        TimeController tc = new TimeController();
    }
}
