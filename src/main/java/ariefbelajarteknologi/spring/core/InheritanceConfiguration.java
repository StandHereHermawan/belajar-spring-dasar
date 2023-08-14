package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
