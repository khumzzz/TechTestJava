package za.co.anycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"za.co.anycompany"})
public class AnyCompanyApp {
    public static void main(String[] args) {
        // Start Up anycompany
        ConfigurableApplicationContext context = SpringApplication.run(AnyCompanyApp.class, args);
        // Print project prompt
        PrintApplicationInfo.printTip(context);
    }
}
