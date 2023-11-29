package com.acme.model;

public abstract class AbstractRoadBike extends AbstractBike {

    public AbstractRoadBike(FrameColors color) {
        super(color);
    }

    @Override
    protected String getWheelType() {
        return "Normal";
    }
}
