package edu.wctc;

import edu.wctc.input.ConsoleInput;
import edu.wctc.input.FileInput;
import edu.wctc.input.ISalesInput;
import edu.wctc.report.DetailedReport;
import edu.wctc.report.ISalesReport;
import edu.wctc.shipping.DomesticPolicy;
import edu.wctc.shipping.FreePolicy;
import edu.wctc.shipping.IShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public ISalesInput iSalesInput() {
        return new ConsoleInput();
    }

    @Bean
    public ISalesReport iSalesReport() {
        return new DetailedReport();
    }

    @Bean
    public IShippingPolicy iShippingPolicy() {
        return new DomesticPolicy();
    }
}
