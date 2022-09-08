package edu.wctc.report;

import edu.wctc.Sale;

import java.util.List;

public class DetailedReport implements ISalesReport{
    @Override
    public void createSalesReport(List<Sale> saleList) {
        System.out.println("GENERATING DETAILED REPORT");
        for(Sale sale : saleList){
            System.out.println("Customer: " + sale.getCustomer() + ", Country: " + sale.getCountry() +
                    ", Sale Amount: $" + sale.getAmount() + ", Tax: " + sale.getTax() + ", Shipping: $" + sale.getShipping());
        }
    }
}
