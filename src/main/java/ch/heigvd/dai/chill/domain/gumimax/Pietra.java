package ch.heigvd.dai.chill.domain.gumimax;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Pietra implements IProduct {

    public final static String NAME = "Pietra";
    public final static BigDecimal PRICE = new BigDecimal(6.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
