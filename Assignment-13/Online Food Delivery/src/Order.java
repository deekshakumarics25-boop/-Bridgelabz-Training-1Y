public class Order implements Runnable{
    private int orderId;
    private String restaurantName;
    private int deliveryTime;

    Order(int orderId,String restaurantName,int deliveryTime){
        this.orderId=orderId;
        this.restaurantName=restaurantName;
        this.deliveryTime=deliveryTime;
    }

    @Override
    public void run() {
        long startTime=System.currentTimeMillis();
        try{
            System.out.println("Order:" + orderId + " from " + restaurantName + " picked up by " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("Order:" + orderId + " from " + restaurantName + " in transit");
            Thread.sleep(deliveryTime*1000);
            System.out.println("Order:" + orderId + " from " + restaurantName + " delivered by " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Order #" + orderId +
                " completed in " + (endTime - startTime)/1000.0 + " seconds\n");
    }
}
