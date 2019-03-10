package marsmission.domain;
import java.util.Map;

public interface SuperFacility {
    public void setName(String name);
    public void setAddress(String address);
    public void setDescription(String description);
    public void setRefNumber(int refNumber);
    public void setCapacity(int capacity);
    public void setCost(double cost);
    public void setProblemRate(int problemRate);
    public String getName();
    public String getAddress();
    public String getDescription();
    public int getRefNumber();
    public int getCapacity();
    public double getCost();
    public int getProblemRate();
    public void oxygenator(boolean oxygenator);
    public void nuclearReactor(boolean nuclearReactor);
    public void innerAirlocks(boolean innerAirlocks);
    public void externalAirlocks(boolean externalAirlocks);
    public void comms(boolean comms);
    public void waterMaking(boolean waterMaking);
    public void startMachines();
    public Map getMap();
    public void getFacilityStatus();
    public void getFacilityStatus(Map<String, Boolean> map);
}
