package com.programmers.abstractFactoryMethod.standard;

import com.programmers.abstractFactoryMethod.inter.Anchor;
import com.programmers.abstractFactoryMethod.inter.ShipPartsFactory;
import com.programmers.abstractFactoryMethod.inter.Wheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
