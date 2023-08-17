import com.springtest3.service.UpdateService;
import com.springtest3.springconfig.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Target;

/**
 * Author:李海旭
 * Date : 2023/8/17 16:26
 */
public class Resources {
    @Test
    public void resources(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UpdateService updateService = context.getBean("updateService", UpdateService.class);
        updateService.updateMessage();
    }
}
