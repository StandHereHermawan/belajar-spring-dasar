package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.Foo;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    public Foo foo(){
        Foo foo = new Foo();
        return foo;
    }

}
