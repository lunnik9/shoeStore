package product.demo.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/product/info")
public class ProductController {

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable("productId") String productId){
        return new Product(productId,"name",new ArrayList<String>(),10,100,200);
    }

}
