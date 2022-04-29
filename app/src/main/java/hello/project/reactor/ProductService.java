package hello.project.reactor;

import reactor.core.publisher.Flux;

import java.util.function.Predicate;

public class ProductService {

    public Flux<ProductModel> searchProducts(String choice) {
        Predicate<ProductModel> byProductCategory = productModel -> productModel.productType.equals(choice);
        Flux<ProductModel> productModels = ProductFactory.getGoodsProducts().filter(
                byProductCategory
        ).mergeWith(
                ProductFactory.getPantryProducts().filter(byProductCategory));
        return productModels.switchIfEmpty(ProductFactory.getDefaultProducts().filter(byProductCategory));
    }
}
