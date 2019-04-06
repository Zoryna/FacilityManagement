package mmtest.domain;
import java.util.*;

public interface InspectionInterface {

    public boolean isBroken();

    public boolean makeMaintenanceRequest();

    public int checkMachines(Map<String, Boolean> map);

    public Map<String, Boolean> returnBrokenMachines(Map<String, Boolean> map, boolean[] machines);

}
