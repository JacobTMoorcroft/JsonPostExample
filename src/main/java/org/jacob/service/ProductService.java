package org.jacob.service;

import org.jacob.mapper.ConsolidatedProductMapper;
import org.jacob.model.ConsolidatedProduct;
import org.jacob.model.ProductDescriptions;
import org.jacob.model.ProductItineries;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductDescriptionService productDescriptionService;
    private final ProductItineraryService productItineraryService;
    private final ConsolidatedProductMapper consolidatedProductMapper;

    ProductService(ProductDescriptionService productDescriptionService, ProductItineraryService productItineraryService,
    ConsolidatedProductMapper consolidatedProductMapper) {
        this.productDescriptionService = productDescriptionService;
        this.productItineraryService = productItineraryService;
        this.consolidatedProductMapper = consolidatedProductMapper;
    }


    public List<ConsolidatedProduct> getProducts() {
        List<ProductDescriptions> productDescriptionList = productDescriptionService.getProductDescriptions();
        List<ProductItineries> productItineriesList = productItineraryService.getProductItineries();
        List<ConsolidatedProduct> products = new ArrayList<>();

        for (ProductDescriptions productDescription : productDescriptionList) {
            ProductItineries relatedProductItinery = productItineriesList.stream()
                    .filter(productItineries -> productItineries.getId().equals(productDescription.getId()))
                    .findFirst()
                    .orElse(null);
            if (relatedProductItinery != null) {
                ConsolidatedProduct product = consolidatedProductMapper.map(productDescription, relatedProductItinery);
                products.add(product);
            }
        }
        return products;
    }
}
