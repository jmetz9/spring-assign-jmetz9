package edu.wctc;

import edu.wctc.input.FileInput;
import edu.wctc.input.ISalesInput;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((ReportGenerator)context.getBean("reportGenerator")).generateReport();

    }
}
