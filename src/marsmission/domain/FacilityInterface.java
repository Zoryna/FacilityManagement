package marsmission.domain;
import java.util.Map;

public interface FacilityInterface {
    public void setName(String name);
    public void setAddress(String address);
    public void setDescription(String description);
    public void setRefNumber(int refNumber);
    public void setCapacity(int capacity);
    public void setCost(double cost);
    public void setProblemRate(int problemRate);
    public void setOxygenator(Oxygenator o);
    public void setNuclearReactor(NuclearReactor n);
    public void setInnerAirlocks(InnerAirlocks inn);
    public void setExternalAirlocks(ExternalAirlocks ex);
    public void setComms(Comms com);
    public void setWaterExtraction(WaterExtraction w);
    public String getName();
    public String getAddress();
    public String getDescription();
    public int getRefNumber();
    public int getCapacity();
    public double getCost();
    public int getProblemRate();
    public Oxygenator getOxygenator();
    public NuclearReactor getNuclearReactor();
    public InnerAirlocks getInnerAirlocks();
    public ExternalAirlocks getExternalAirlocks();
    public Comms getComms();
    public WaterExtraction getWaterMaking();

}
