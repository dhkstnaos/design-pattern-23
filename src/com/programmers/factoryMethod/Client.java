package com.programmers.factoryMethod;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(),"whiteShip","dhkstnaos@gmail.com");
        client.print(new BlackShipFactory(),"blackShip","dhkstnaos@gmail.com");
    }
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }
}
