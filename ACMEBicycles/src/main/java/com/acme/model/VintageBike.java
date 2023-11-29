package com.acme.model;

import java.math.BigDecimal;

public class VintageBike extends AbstractRoadBike {

    public VintageBike() {
        super(FrameColors.RED);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(299.99);
    }

    @Override
    protected int getStartNumber() {
        return 753159;
    }

    @Override
    protected String getPrefix() {
        return "VB801";
    }

}
