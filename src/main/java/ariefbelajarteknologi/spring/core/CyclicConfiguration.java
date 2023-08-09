package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.cyclic.CyclicA;
import ariefbelajarteknologi.spring.core.data.cyclic.CyclicB;
import ariefbelajarteknologi.spring.core.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicA(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
