interface FacilityUse {
    boolean isInUseDuringInterval();
    boolean assignFacilityToUse();
    boolean vacateFacility();
    String listInspections();
    String listActualUsage();
    int calcUsageRate();
}