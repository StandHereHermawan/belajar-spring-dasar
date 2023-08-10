package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.Connection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @Test
    void testConnection() {

        Connection connection = applicationContext.getBean(Connection.class);

    }
}
