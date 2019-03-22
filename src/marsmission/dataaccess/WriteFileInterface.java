package marsmission.dataaccess;

import marsmission.domain.*;

public interface WriteFileInterface {
    public void setFileName(String fileName);
    public String getFileName();
    public void saveFacilityInfo(Facility fac);
}
