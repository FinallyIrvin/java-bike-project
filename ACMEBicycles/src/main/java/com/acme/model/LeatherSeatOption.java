package com.acme.model;

import java.math.BigDecimal;

public class LeatherSeatOption extends AbstractBikeOption {

    public LeatherSeatOption(AbstractBike bike) {
        super(bike);
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
    public String getOptionName() {
        return "Leather Seat Upgrade";
    }

    @Override
    public BigDecimal getOptionAmount(){
        return BigDecimal.valueOf(98.99);
    }

    @Override
    public String toString() {
        return decoratedBike.toString();
    }


}
