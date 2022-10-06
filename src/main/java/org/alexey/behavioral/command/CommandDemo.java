package org.alexey.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        new CommandDemo().run();
    }

    private void run() {
        Stock stock = new Stock("ABC", 10);

        Order buyOrder = new BuyStock(stock);
        Order sellOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }
}
