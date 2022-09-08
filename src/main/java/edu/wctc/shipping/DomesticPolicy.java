package edu.wctc.shipping;

import edu.wctc.Sale;

public class DomesticPolicy implements IShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(Math.round((sale.getAmount()/10) * 100.0) / 100.0);
    }
}
