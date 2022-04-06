package com.programmers.abstractFactoryMethod;

import com.programmers.abstractFactoryMethod.inter.ShipPartsFactory;
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
