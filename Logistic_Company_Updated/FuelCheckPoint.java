package com.gla;

public class FuelCheckPoint extends CheckPoint{
    public FuelCheckPoint(String checkPointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        super(checkPointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }
    boolean isCritical() {
        return true;
    }

    String getType() {
        return "FuelCheckpoint";
    }

    @Override
    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }
}
