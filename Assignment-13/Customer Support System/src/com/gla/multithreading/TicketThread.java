package com.gla.multithreading;

import java.util.*;

class TicketThread extends Thread {
    private int ticketId;
    private String type;
    private int priority;
    private int queuePosition;
    private static Random rand = new Random();
    public long processingTime = 0;

    TicketThread(int id, String type, int priority, int queuePosition, String agentName) {
        super(agentName);
        this.ticketId = id;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();

            System.out.println(
                    "Ticket #" + ticketId +
                            " | Type: " + type +
                            " | Agent: " + getName() +
                            " | Priority: " + priority +
                            " | Queue Position: " + queuePosition +
                            " -> STARTED"
            );

            int sleepTime = (rand.nextInt(5) + 1) * 1000;
            Thread.sleep(sleepTime);

            long end = System.currentTimeMillis();
            processingTime = (end - start);

            System.out.println(
                    "Ticket #" + ticketId +
                            " -> COMPLETED in " + (processingTime / 1000.0) + " sec\n"
            );

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getPriorityLevel() {
        return priority;
    }
}
