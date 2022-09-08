package edu.wctc.shipping;

import edu.wctc.Sale;

public interface IShippingPolicy {
    void applyShipping(Sale sale);
}
