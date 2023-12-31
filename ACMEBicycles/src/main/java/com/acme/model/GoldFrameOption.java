package com.acme.model;

import java.math.BigDecimal;

public class GoldFrameOption extends AbstractBikeOption{

    public GoldFrameOption(AbstractBike bike) {
        super(bike);
        bike.paintFrame(FrameColors.GOLD);
    }

    @Override
    public String getOptionName() {
        return "Gold Frame Upgrade";
    }

    @Override
    public BigDecimal getOptionAmount() {
        return BigDecimal.valueOf(299.99);
    }

    @Override
    public BigDecimal getPrice() {
        return decoratedBike.getPrice();
    }

    @Override
    public int getStartNumber() {
        return decoratedBike.getStartNumber();
    }

    @Override
    public String getPrefix() {
        return decoratedBike.getPrefix();
    }

    @Override
    public String getWheelType() {
        return decoratedBike.getWheelType();
    }

    @Override
    public FrameColors getFrameColor() {
        return FrameColors.GOLD;
    }

    @Override
    public String getSerialNumber() {
        return decoratedBike.getSerialNumber();
    }

    @Override
    public String toString() {
        return decoratedBike.toString();
    }
}
