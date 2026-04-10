package com.gla;


 class DeliveryCheckPoint extends CheckPoint {
     public DeliveryCheckPoint(int checkPointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
         super(checkPointId, locationName, distanceFromLast, expectedDuration, actualDuration);
     }

     boolean isCritical() {
         return true;
     }

     String getType() {
         return "DeliveryCheckpoint";
     }

     @Override
     double calculatePenalty() {
         if (isDelayed()) {
             return (actualDuration - expectedDuration )* 2;
         }
         return 0;
     }
 }

