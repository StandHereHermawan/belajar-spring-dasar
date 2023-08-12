package ariefbelajarteknologi.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "ariefbelajarteknologi.spring.core.repository",
        "ariefbelajarteknologi.spring.core.service",
        "ariefbelajarteknologi.spring.core.configuration"
})
public class ComponentConfiguration {
}
