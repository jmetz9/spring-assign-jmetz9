package edu.wctc;

import edu.wctc.input.ISalesInput;
import edu.wctc.report.ISalesReport;
import edu.wctc.shipping.IShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportGenerator {
    ISalesInput iSalesInput;
    ISalesReport iSalesReport;
    IShippingPolicy iShippingPolicy;

    @Autowired
    public ReportGenerator(ISalesInput iSalesInput, ISalesReport iSalesReport, IShippingPolicy iShippingPolicy) {
        this.iSalesInput = iSalesInput;
        this.iSalesReport = iSalesReport;
        this.iShippingPolicy = iShippingPolicy;
    }

    public void generateReport(){
        List<Sale> allSales = iSalesInput.getSales();
        for(Sale aSale : allSales)
            iShippingPolicy.applyShipping(aSale);
        iSalesReport.createSalesReport(allSales);
    }
}
