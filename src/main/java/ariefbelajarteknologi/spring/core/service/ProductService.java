package ariefbelajarteknologi.spring.core.service;

import ariefbelajarteknologi.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

// @Scope("prototype")
// @Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

}
