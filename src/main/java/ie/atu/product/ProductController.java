package ie.atu.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product-id")
    public String getProductById() {
            productService.fetchProductById();
        return "Total";
    }

    @GetMapping("/new-product")
    public String addProduct() {
        productService.addProduct();
        return "Total";
    }
}
