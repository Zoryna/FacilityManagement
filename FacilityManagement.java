interface FacilityManagement {
    boolean makeFacilityMaintRequest();
    boolean scheduleMaintenance();
    int calcMaintenanceCostForFacility();
    int calcProblemRateForFacility();
    int calcDownTimeForFacility();
    String listMaintRequests();
    String listMaintenance();
    String listFacilityProblems();
}