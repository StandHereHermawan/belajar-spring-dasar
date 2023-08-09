package ariefbelajarteknologi.spring.core;

import ariefbelajarteknologi.spring.core.data.Bar;
import ariefbelajarteknologi.spring.core.data.Foo;
import ariefbelajarteknologi.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DependencyInjectionTest {

    @Test
    void testWithoutDependencyInjection() {

        Foo foo = new Foo();
        Bar bar = new Bar();

        FooBar fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo,fooBar.getFoo());
        Assertions.assertSame(bar,fooBar.getBar());

    }
}
