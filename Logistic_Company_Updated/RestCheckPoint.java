package com.gla;

public class RestCheckPoint extends CheckPoint{
    public RestCheckPoint(String checkPointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        super(checkPointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "RestCheckpoint";
    }

    @Override
    double calculatePenalty() {
        if (isDelayed() && ( (actualDuration-expectedDuration)>30)) {
            return (actualDuration - expectedDuration )* 0.5;
        }
        return 0;
    }
}

