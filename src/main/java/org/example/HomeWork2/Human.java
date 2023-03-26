package org.example.HomeWork2;

public class Human extends Buyer {
    @Override
    String getName() {
        return name;
    }
    @Override
    public void setMakeOrder() {
        isMakeOrderCS = true;
    }
    @Override
    public void setTakeOrder() {
        isTakeOrderCS = true;
    }
    @Override
    public boolean isMakeOrder() {
        return isMakeOrderCS;
    }
    @Override
    public boolean isTakeOrder() {
        return isTakeOrderCS;
    }
}
