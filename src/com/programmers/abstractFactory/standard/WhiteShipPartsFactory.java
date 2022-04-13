package com.programmers.abstractFactory.standard;

import com.programmers.abstractFactory.inter.Anchor;
import com.programmers.abstractFactory.inter.ShipPartsFactory;
import com.programmers.abstractFactory.inter.Wheel;

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
