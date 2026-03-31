import java.time.LocalTime;

public class SmartHomeDevices implements Runnable {
    private String name;
    private int interval;

    SmartHomeDevices(String name, int seconds) {
        this.name = name;
        this.interval = seconds * 1000;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "[" + LocalTime.now() + "] " +
                            name + " is running | Thread: " +
                            Thread.currentThread().getName() +
                            " | Priority: " + Thread.currentThread().getPriority()
            );

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Name:" + name + "Finished execution");
    }
}
