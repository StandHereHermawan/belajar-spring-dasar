package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({
        "ariefbelajarteknologi.spring.core.repository",
        "ariefbelajarteknologi.spring.core.service",
        "ariefbelajarteknologi.spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
