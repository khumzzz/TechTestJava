package za.co.anycompany;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class PrintApplicationInfo {
    public static void printTip(ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        // Project profile
        StringBuffer tip = new StringBuffer();
        tip.append("================================================\n");
        tip.append("                                                                                  \n");
        tip . append( "   !!!Preparation work!!!                   \n " );
        tip . append( " 1. Configured spring boot                  \n " );
        tip . append( " 2. Used hibernate to access DB             \n " );
        tip . append( " 3. Refactoring and redoing                 \n " );
        tip.append("                                               \n "  );
        tip.append("===============================================\n");
        System.out.println(tip.toString());
    }
}
