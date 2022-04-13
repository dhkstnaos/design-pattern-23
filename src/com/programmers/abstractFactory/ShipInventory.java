package com.programmers.abstractFactory;

import com.programmers.abstractFactory.pro.WhitePartsProFactory;
import com.programmers.factoryMethod.Ship;
import com.programmers.factoryMethod.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory whiteShipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = whiteShipFactory.createShip();
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getAnchor().getClass() = " + ship.getWheel().getClass());
    }
}