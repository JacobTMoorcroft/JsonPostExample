package org.jacob.service;

import org.jacob.model.ProductDescriptions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDescriptionService {

    List<ProductDescriptions> productDescriptions;

    ProductDescriptionService() {
        productDescriptions = new ArrayList<>();
        productDescriptions.add(new ProductDescriptions(1234, "milk", "mm milk"));
        productDescriptions.add(new ProductDescriptions(8473, "cheese", "cathederal city"));
        productDescriptions.add(new ProductDescriptions(7843, "chicken", "cak a doodle doo"));
    }


    public List<ProductDescriptions> getProductDescriptions() {
        return productDescriptions;
    }
}
