package com.programmers.abstractFactoryMethod.pro;

import com.programmers.abstractFactoryMethod.inter.Anchor;
import com.programmers.abstractFactoryMethod.inter.ShipPartsFactory;
import com.programmers.abstractFactoryMethod.inter.Wheel;

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
