package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.Connection;
import ariefbelajarteknologi.spring.core.data.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server() {
        return new Server();
    }

}
