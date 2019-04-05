package marsmission.domain;

import java.util.Map;
import java.util.HashMap;

public interface MachinesInterface {
    public void setFacility(Facility fac);
    public Facility getFacility();
    public void setStatus(boolean s);
    public boolean status();
    public String getMachine();
}
