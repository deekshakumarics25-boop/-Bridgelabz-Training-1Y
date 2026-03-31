import java.security.Security;

public class Main {
    public static void main(String[] args){
        Thread temperature=new Thread(new SmartHomeDevices("Temperature sensor",5));
        Thread security=new Thread(new SmartHomeDevices("Security camera",3));
        Thread light = new Thread(new SmartHomeDevices("Light controller",4));
        Thread doorLock=new Thread(new SmartHomeDevices("Door lock monitor",6));

        security.setPriority(10);
        temperature.setPriority(7);
        light.setPriority(5);
        doorLock.setPriority(5);

        temperature.start();
        security.start();
        light.start();
        doorLock.start();

        try{
            temperature.join();
            security.join();
            light.join();
            doorLock.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nAll Smart Home Devices have completed execution.");

    }
}
