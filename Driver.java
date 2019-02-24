import marsmission.habcontrol.*;
import marsmission.dataaccess.*;
import marsmission.simulation.*;
import marsmission.management.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
        Facility apollo = new Facility("Apollo", 0);
        Facility nyx = new Facility("Nyx", 1);

        if (apollo == nyx){
            System.out.println("TRUE. The objects are the same.");
        } else {
            System.out.println("FALSE. The objects are different.");
        }

        if (apollo.getName() == nyx.getName()){
            System.out.println("TRUE. The names are the same.");
        } else {
            System.out.println("FALSE. The names are different.");
        }

    }
}
