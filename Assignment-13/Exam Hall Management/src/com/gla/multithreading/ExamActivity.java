package com.gla.multithreading;

public class ExamActivity implements Runnable {
    private String activityName;
    private int startDelay;
    private int duration;

    ExamActivity(String name, int delay, int duration) {
        this.activityName = name;
        this.startDelay = delay;
        this.duration = duration;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(startDelay * 1000);

            System.out.println(Thread.currentThread().getName() +
                    " STARTED: " + activityName);

            for(int i = 1; i <= duration; i++) {
                System.out.println(activityName + " in progress... (" + i + "s)");
                Thread.sleep(1000);
            }

            System.out.println(Thread.currentThread().getName() +
                    " COMPLETED: " + activityName + "\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
