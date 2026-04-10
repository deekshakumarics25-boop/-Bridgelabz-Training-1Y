package com.gla;

public abstract class CheckPoint {
    int checkPointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    CheckPoint(int checkPointId,String locationName,double distanceFromLast,int expectedDuration,int actualDuration){
        this.checkPointId=checkPointId;
        this.locationName=locationName;
        this.distanceFromLast=distanceFromLast;
        this.expectedDuration=expectedDuration;
        this.actualDuration=actualDuration;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }
    abstract boolean isCritical();
    abstract String getType();
    abstract double calculatePenalty();
}

