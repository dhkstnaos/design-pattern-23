package com.programmers.abstractFactory.pro;

import com.programmers.abstractFactory.inter.Anchor;
import com.programmers.abstractFactory.inter.ShipPartsFactory;
import com.programmers.abstractFactory.inter.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
