import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tasks.ITaskService;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        context.registerShutdownHook();

        ITaskService myService = (ITaskService) context.getBean("taskService");
        System.out.println("taskService id = " + myService.getServiceId());
    }
}
