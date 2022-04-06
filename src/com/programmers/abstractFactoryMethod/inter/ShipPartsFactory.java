package com.programmers.abstractFactoryMethod.inter;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
