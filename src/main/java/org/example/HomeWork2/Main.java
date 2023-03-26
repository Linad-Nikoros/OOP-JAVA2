package org.example.HomeWork2;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name ="Григорий";
        Market market = new Market();
        market.acceptToMarket(human1);
        market.takeInQueue(human1);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human1);
        market.update();
    }
}
