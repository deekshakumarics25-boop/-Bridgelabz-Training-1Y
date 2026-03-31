public class Main {
    public static void main(String[] args){

        Thread t1=new Thread(new Order(1,"KFC",2),"Agent-1");
        Thread t2=new Thread(new Order(2,"Domino's",3),"Agent-2");
        Thread t3=new Thread(new Order(3,"Burger king",4),"Agent-3");
        Thread t4=new Thread(new Order(4,"Pizza Hut",5),"Agent-4");
        Thread t5=new Thread(new Order(5,"McDonald",6),"Agent-5");

        t1.setPriority(10);
        t2.setPriority(10);
        t3.setPriority(5);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
