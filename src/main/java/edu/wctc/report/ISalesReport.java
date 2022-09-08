package edu.wctc.report;

import edu.wctc.Sale;

import java.util.List;

public interface ISalesReport {
    void createSalesReport(List<Sale> saleList);
}
