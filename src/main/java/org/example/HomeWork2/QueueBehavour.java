package org.example.HomeWork2;

public interface QueueBehavour {

    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
