package edu.wctc.shipping;

import edu.wctc.Sale;

public class FreePolicy implements IShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0.00);
    }
}
