import by.iba.conf.Config;
import by.iba.entity.Subsystem;
import by.iba.repository.SubsystemRepository;
import org.junit.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.transaction.Transactional;

@Transactional
public class Test {

    private SubsystemRepository userRepository;

    @Before
    public void init(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        userRepository = context.getBean(SubsystemRepository.class);
    }

    @org.junit.Test
    public void testMethod(){
        Subsystem subsystem = new Subsystem("IMS");
        userRepository.save(subsystem);
    }
}
