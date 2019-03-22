package marsmission.domain;

public interface TimeControllerInterface {

    public void setHours(int hours);

    public void setMinutes(int minutes);

    public void setSeconds(int seconds);

    public int getHours();

    public int getMinutes();

    public int getSeconds();
}
