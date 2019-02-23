import marsmission.habcontrol.*;
import marsmission.dataaccess.*;
import marsmission.simulation.*;
import marsmission.management.*;

public class Driver {
    public static void main(String[] args){
        Facility apollo = new Facility("Apollo", 0);
        Facility nyx = new Facility("Nyx", 1);
        Facility erebos = new Facility("Erebos", 2);
        Facility athena = new Facility("Athena", 3);
        Facility artemis = new Facility("Artemis", 4);
        StateMachine sm = new StateMachine();
        Control c = new Control();
        TimeController tc = new TimeController();
    }
}
