package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.Bar;
import ariefbelajarteknologi.spring.core.data.Foo;
import ariefbelajarteknologi.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDepencencyInjection() {

        Foo foo = applicationContext.getBean("fooSecond",Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertSame(foo,fooBar.getFoo());
        Assertions.assertSame(bar,fooBar.getBar());

    }

    @Test
    void testWithoutDependencyInjection() {

        Foo foo = new Foo();
        Bar bar = new Bar();

        FooBar fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo,fooBar.getFoo());
        Assertions.assertSame(bar,fooBar.getBar());

    }
}
