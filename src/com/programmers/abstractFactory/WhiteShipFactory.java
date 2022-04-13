package com.programmers.abstractFactory;

import com.programmers.abstractFactory.inter.ShipPartsFactory;
import com.programmers.factoryMethod.Ship;
import com.programmers.factoryMethod.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {
    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
